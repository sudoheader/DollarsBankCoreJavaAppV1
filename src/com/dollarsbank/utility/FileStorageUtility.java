package com.dollarsbank.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class FileStorageUtility {

    public static void readFile() throws IOException, FileNotFoundException, Exception {
        File file = new File("resources/.dat");
        FileReader fileReader = null;
        BufferedReader reader = null;

        fileReader = new FileReader(file);
        reader = new BufferedReader(fileReader);

        // read the whole file
        System.out.println("\nReading in .dat");
        System.out.println("-----------------");

        String line = "";
        while(line != null) {
            line = reader.readLine();
            System.out.println(line);
        }

        reader.close();
        fileReader.close();
    }

    public static void writeFile(int choice, String text) throws Exception {
        File file = new File("resources/temp.txt");

        FileWriter filewriter = new FileWriter(file, true);
        BufferedWriter buffWriter = new BufferedWriter(filewriter);
        PrintWriter printWriter = new PrintWriter(buffWriter);

        switch (choice) {
            case 1 -> writeWithBuffer(buffWriter, text);
            case 2 -> appendToFile(buffWriter, text);
            case 3 -> writeUsingPrintWriter(printWriter, text);
            default -> System.out.println("Not a valid option.");
        }

        printWriter.close();
        buffWriter.close();
        filewriter.close();
    }

    public static void writeWithBuffer(BufferedWriter writer, String str) throws IOException, Exception {
        writer.write(str);
    }

    public static void appendToFile(BufferedWriter writer, String str) throws IOException, Exception {
        writer.append(str);
    }

    public static void writeUsingPrintWriter(PrintWriter writer, String str) {
        writer.println(str);
    }
}
