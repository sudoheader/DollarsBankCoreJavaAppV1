package com.dollarsbank.application;

import com.dollarsbank.utility.ConsolePrinterUtility;

import java.util.Scanner;

public class DollarsBankApplication {

    public static void main(String[] args) {

//        ConsolePrinterUtility.printToConsole();

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        //TODO: based on userinput
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("error");
        }

//        ConsolePrinterUtility.menu();

    }
}
