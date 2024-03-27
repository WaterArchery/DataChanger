package me.waterarchery;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public final static String FILE_PATH = "C:\\Users\\smfar\\IdeaProjects\\DataChanger\\src\\main\\resources\\dataset.csv";
    public final static String OUTPUT_FILE_PATH = "C:\\Users\\smfar\\IdeaProjects\\DataChanger\\src\\main\\resources\\output.csv";

    public static void main(String[] args) throws IOException {
        long lineNumber = 1;
        CSVReader reader = new CSVReader(new FileReader(FILE_PATH));

        List<String[]> csvBody = new ArrayList<>(readCSV(reader));
        List<String[]> untochedCSVBody = new ArrayList<>(csvBody);
        for (int i = 1; i < getLineCount() - 1; i++) {
            System.out.println("Editing line: " + lineNumber);
            String[] line = getLine(i, untochedCSVBody);

            // Changing column number
            updateCSV(csvBody, lineNumber + "", (int) lineNumber, 0);

            // Changing gender
            // Male = 1
            // Female = 0
            int genderLine = 1;
            String gender = line[genderLine];
            if (gender.equalsIgnoreCase("Male"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, genderLine);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, genderLine);

            // Changing yes no in Partner
            // Yes = 1
            // No = 0
            int partnerLine = 3;
            String partner = line[partnerLine];
            if (partner.equalsIgnoreCase("yes"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, partnerLine);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, partnerLine);

            // Changing yes no in Dependents
            // Yes = 1
            // No = 0
            int depententsLine = 4;
            String dependents = line[depententsLine];
            if (dependents.equalsIgnoreCase("yes"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, depententsLine);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, depententsLine);

            // Changing yes no in Phone services
            // Yes = 1
            // No = 0
            int phoneServiceLine = 6;
            String phones = line[phoneServiceLine];
            if (phones.equalsIgnoreCase("yes"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, phoneServiceLine);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, phoneServiceLine);

            // Changing yes no in MultipleLines
            // Yes = 2
            // No = 1
            // No Phone Service = 0
            int multipleLinesLine = 7;
            String multipleLine = line[multipleLinesLine];
            if (multipleLine.equalsIgnoreCase("yes"))
                updateCSV(csvBody, 2 + "", (int) lineNumber, multipleLinesLine);
            else if (multipleLine.equalsIgnoreCase("No"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, multipleLinesLine);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, multipleLinesLine);

            // Changing yes no in InternetService
            // Fiber optic = 2
            // DSL = 1
            // No = 0
            int internetLineNumber = 8;
            String internetLine = line[internetLineNumber];
            if (internetLine.equalsIgnoreCase("Fiber optic"))
                updateCSV(csvBody, 2 + "", (int) lineNumber, internetLineNumber);
            else if (multipleLine.equalsIgnoreCase("DSL"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, internetLineNumber);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, internetLineNumber);

            // Changing yes no in OnlineSecurity
            // Yes = 2
            // No = 1
            // No internet service = 0
            int onlineSecurityLineNumber = 9;
            String securityLine = line[onlineSecurityLineNumber];
            if (securityLine.equalsIgnoreCase("Yes"))
                updateCSV(csvBody, 2 + "", (int) lineNumber, onlineSecurityLineNumber);
            else if (multipleLine.equalsIgnoreCase("No"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, onlineSecurityLineNumber);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, onlineSecurityLineNumber);

            // Changing yes no in OnlineBackup
            // Yes = 2
            // No = 1
            // No internet service = 0
            int backupLineNumber = 10;
            String backupLine = line[backupLineNumber];
            if (backupLine.equalsIgnoreCase("Yes"))
                updateCSV(csvBody, 2 + "", (int) lineNumber, backupLineNumber);
            else if (multipleLine.equalsIgnoreCase("No"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, backupLineNumber);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, backupLineNumber);

            // Changing yes no in DeviceProtection
            // Yes = 2
            // No = 1
            // No internet service = 0
            int deviceLineNumber = 11;
            String deviceLine = line[deviceLineNumber];
            if (deviceLine.equalsIgnoreCase("Yes"))
                updateCSV(csvBody, 2 + "", (int) lineNumber, deviceLineNumber);
            else if (multipleLine.equalsIgnoreCase("No"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, deviceLineNumber);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, deviceLineNumber);

            // Changing yes no in TechSupport
            // Yes = 2
            // No = 1
            // No internet service = 0
            int techSupportLineNumber = 12;
            String techLine = line[techSupportLineNumber];
            if (techLine.equalsIgnoreCase("Yes"))
                updateCSV(csvBody, 2 + "", (int) lineNumber, techSupportLineNumber);
            else if (multipleLine.equalsIgnoreCase("No"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, techSupportLineNumber);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, techSupportLineNumber);

            // Changing yes no in StreamingTV
            // Yes = 2
            // No = 1
            // No internet service = 0
            int streamingLineNumber = 13;
            String streamingLine = line[streamingLineNumber];
            if (streamingLine.equalsIgnoreCase("Yes"))
                updateCSV(csvBody, 2 + "", (int) lineNumber, streamingLineNumber);
            else if (multipleLine.equalsIgnoreCase("No"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, streamingLineNumber);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, streamingLineNumber);

            // Changing yes no in StreamingMovies
            // Yes = 2
            // No = 1
            // No internet service = 0
            int moviesLineNumber = 14;
            String movieLine = line[moviesLineNumber];
            if (movieLine.equalsIgnoreCase("Yes"))
                updateCSV(csvBody, 2 + "", (int) lineNumber, moviesLineNumber);
            else if (multipleLine.equalsIgnoreCase("No"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, moviesLineNumber);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, moviesLineNumber);

            // Changing in Contract
            // Two year = 3
            // One year = 2
            // Month-to-month = 1
            int contractLineNumber = 15;
            String contractLine = line[contractLineNumber];
            if (contractLine.equalsIgnoreCase("Two year"))
                updateCSV(csvBody, 3 + "", (int) lineNumber, contractLineNumber);
            else if (contractLine.equalsIgnoreCase("One year"))
                updateCSV(csvBody, 2 + "", (int) lineNumber, contractLineNumber);
            else
                updateCSV(csvBody, 1 + "", (int) lineNumber, contractLineNumber);

            // Changing yes no in PaperlessBilling
            // Yes = 1
            // No = 0
            int paperLineNumber = 16;
            String paperLine = line[paperLineNumber];
            if (paperLine.equalsIgnoreCase("Yes"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, paperLineNumber);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, paperLineNumber);

            // Changing in PaymentMethod
            // Electronic check = 4
            // Mailed check = 3
            // Bank transfer (automatic) = 2
            // Credit card (automatic) = 1
            int paymentLineNumber = 17;
            String paymentLine = line[paymentLineNumber];
            if (paymentLine.equalsIgnoreCase("Electronic check"))
                updateCSV(csvBody, 4 + "", (int) lineNumber, paymentLineNumber);
            else if (paymentLine.equalsIgnoreCase("Mailed check"))
                updateCSV(csvBody, 3 + "", (int) lineNumber, paymentLineNumber);
            else if (paymentLine.equalsIgnoreCase("Bank transfer (automatic)"))
                updateCSV(csvBody, 2 + "", (int) lineNumber, paymentLineNumber);
            else
                updateCSV(csvBody, 1 + "", (int) lineNumber, paymentLineNumber);

            // Changing yes no in Churn
            // Yes = 1
            // No = 0
            int chumLineNumber = 20;
            String chumLine = line[chumLineNumber];
            if (chumLine.equalsIgnoreCase("Yes"))
                updateCSV(csvBody, 1 + "", (int) lineNumber, chumLineNumber);
            else
                updateCSV(csvBody, 0 + "", (int) lineNumber, chumLineNumber);

            lineNumber++;
        }
        reader.close();
        saveCSV(csvBody);
        System.out.println("Done");
    }


    public static List<String[]> readCSV(CSVReader reader) {
        List<String[]> csvBody = new ArrayList<>();
        try {
            csvBody = reader.readAll();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return csvBody;
    }

    public static List<String[]> updateCSV(List<String[]> csvBody, String replace, int row, int col) {
        try {
            csvBody.get(row)[col]=replace;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return csvBody;
    }

    public static void saveCSV(List<String[]> csvBody) {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(OUTPUT_FILE_PATH));
            writer.writeAll(csvBody);
            writer.flush();
            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] getLine(int row, List<String[]> csvBody) {
        return csvBody.get(row);
    }

    public static int getLineCount() {
        Path filePath = Path.of(FILE_PATH);
        try (Reader reader = Files.newBufferedReader(filePath)) {
            try (CSVReader csvReader = new CSVReader(reader)) {
                return csvReader.readAll().size();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }


}