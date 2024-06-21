package functions;

import models.InformationConversion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDateTime;

public class ConversionHistory {
    String fileName = "conversionHistory.txt";

    public ConversionHistory() {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addToHistory(InformationConversion conversion, String message) {
        try {
            LocalDateTime date = LocalDateTime.now();
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file, true);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm:ss");
            fileWriter.write("Fecha de conversión: " + date.format(formatter) + " " + message + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Ocurrio un error inesperado al guardar la conversión en tu historial");
            throw new RuntimeException(e);
        }
    }

    public void readHistory() {
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            int contadorDeLineas = 0;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
                contadorDeLineas++;
            }
            if (contadorDeLineas == 0) {
                System.out.println("No hay registros en tu historial de conversiones");
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("No se pudo leer el historial de conversiónes");
        }
    }

    public void clearHistory() {
        try {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("");
            fileWriter.flush();
            System.out.println("Historial de conversiones borrado exitosamente");
        } catch (IOException e) {
            System.out.println("No se pudo borrar el historial de conversiones");
        }
    }
}
