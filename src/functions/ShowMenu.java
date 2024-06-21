package functions;

import java.util.Scanner;

public class ShowMenu {
    public void titleAndOptions() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("""
                =======================================
                   Bienvenido al conversor de monedas
                =======================================
                """);
        System.out.println("Por favor escribe el número correspondiente a la operación que deseas realizar");
        System.out.println("1 - Convertir entre tipos de moneda");
        System.out.println("2 - Consultar historial de conversiones");
        System.out.println("3 - Borrar historial de conversiones");
        System.out.println("0 - Salir");
    }

    public String validCodeSize(Scanner input) {
        boolean inputValid = false;
        String code = "";
        while (!inputValid) {
            code = input.nextLine().trim().toUpperCase();
            if (code.length() == 3 && code.matches("[A-Z]+")) {
                inputValid = true;
            } else {
                System.out.println("Codigo invalido, El código de moneda debe de tener exactamente 3 caracteres y solo debe estar formado por letras");
            }
        }
        return code;
    }

    public void showFormatCode() {
        System.out.println("Por favor escribe el código de la moneda en base al formato ISO 4217");
        System.out.println("""
                        Aqui hay algunos ejemplos de códigos de moneda:
                         USD - Dólar Estadounidense
                         MXN - Peso Mexicano
                         EUR - Euro
                         ARS - Peso Argentino
                         COP - Peso Colombiano
                        """);
    }
}
