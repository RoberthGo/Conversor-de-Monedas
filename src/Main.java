import com.google.gson.Gson;
import functions.*;
import models.Coins;
import models.InformationConversion;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Adentro del constructor de ConnectionApi debes cambiar el texto API_KEY por tu propia clave de API
            para poder hacer las peticiones a la API de exchangerate-api.com
        */
        ConnectionApi connection = new ConnectionApi("API_KEY");
        ConversionHistory history = new ConversionHistory();
        Gson gson = new Gson();
        Scanner input = new Scanner(System.in);
        ShowMenu menu = new ShowMenu();
        String option = "1";
        do {
            menu.titleAndOptions();
            option = input.nextLine();
            if (option.equals("1")) {
                String baseCode = "", targetCode = "";
                menu.showFormatCode();
                baseCode = menu.validCodeSize(input);
                System.out.println("¿A qué moneda deseas convertir la moneda " + baseCode + "?");
                targetCode = menu.validCodeSize(input);
                System.out.println("Ingresa la cantidad de " + baseCode + " que deseas convertir a " + targetCode + " (Solo se debe ingresar el numero sin caracteres especiales)");
                BigDecimal amount = new BigDecimal(0);
                while (true) {
                    try {
                        amount = input.nextBigDecimal();
                        if (amount.compareTo(BigDecimal.ZERO) >= 0) {
                            break;
                        }
                        System.out.println("Es obligatorio que ingrese una cantidad mayor o igual a 0");
                    } catch (InputMismatchException e) {
                        System.out.println("El numero ingresado no es invalido, por favor intenta de nuevo");
                        input.nextLine();
                    }
                }
                input.nextLine();

                String response = connection.getConversion(new InformationConversion(baseCode, targetCode, amount));
                if (!response.isEmpty()) {
                    InformationConversion result;
                    try {
                        result = new InformationConversion(gson.fromJson(response, Coins.class), amount);
                    } catch (Exception e) {
                        System.out.println("A ocurrido un error inesperado");
                        System.out.println("Verifique que su API KEY sea correcta y que tenga permisos para hacer peticiones a la API de exchangerate-api.com");
                        System.out.println("Si el problema persiste, por favor intente mas tarde");
                        break;
                    }

                    if (result.getBaseCode() == null || result.getTargetCode() == null || result.getConversionResult() == null) {
                        System.out.println("Es posible que algunas de las monedas ingresadas no sean validas, por favor intenta de nuevo.");
                    } else {
                        String message = "Convertiste " + amount + " " + result.getBaseCode() + " a " + result.getConversionResult() + " " + result.getTargetCode() + "\n";
                        System.out.println(message);
                        history.addToHistory(result, message);
                    }
                } else {
                    System.out.println("Ocurrio un error al intentar convertir su moneda, intentelo mas tarde");
                }
            } else if (option.equals("2")) {
                history.readHistory();
            } else if (option.equals("3")) {
                System.out.println("¿Estas seguro que deseas borrar el historial de conversiones? (S/N)");
                String ans = "";
                while (true) {
                    ans = input.nextLine().trim().toUpperCase();
                    if (ans.equals("S")) {
                        history.clearHistory();
                        break;
                    } else if (ans.equals("N")) {
                        break;
                    } else {
                        System.out.println("Por favor ingrese una respuesta valida (S/N)");
                    }
                }
            } else if (!option.equals("0")) {
                System.out.println("Opcion no valida, por favor intenta de nuevo");
            } else if (option.equals("0")) {
                break;
            }
            System.out.println("Presiona enter para continuar...");
            input.nextLine();
        } while (!option.equals("0"));

        System.out.println("¡Gracias por usar el conversor de monedas, hasta luego!");
    }
}