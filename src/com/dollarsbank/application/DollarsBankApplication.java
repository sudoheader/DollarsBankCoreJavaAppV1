package com.dollarsbank.application;

import com.dollarsbank.utility.ColorsUtility;
import com.dollarsbank.utility.ConsolePrinterUtility;

import java.util.Scanner;

public class DollarsBankApplication {

    public static void main(String[] args) {

//        ConsolePrinterUtility.printToConsole();

        ConsolePrinterUtility.menu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.print(ColorsUtility.RESET + choice);

        //TODO: based on userinput
        switch (choice) {
            case 1:
                // write (or append) to .dat
                ConsolePrinterUtility.registration();
//                try(String input = scanner.nextLine();) {
//
//                } catch () {
//
//                }
                break;
            case 2:
                // read to .dat
                ConsolePrinterUtility.credentials();
                break;
            case 3:
                ConsolePrinterUtility.exit();
                break;
            default:
                System.out.println("error");
        }

//        ConsolePrinterUtility.menu();

    }
}
