package com.dollarsbank.controller;

//import com.dollarsbank.model.Account;
//import com.dollarsbank.model.Customer;

import com.dollarsbank.utility.ConsolePrinterUtility;
import com.dollarsbank.utility.DataGeneratorStubUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DollarsBankController {

    public static ConsolePrinterUtility cpu = new ConsolePrinterUtility();
    public static DataGeneratorStubUtil dgsu = new DataGeneratorStubUtil();

    int choice = 0;
    Scanner sc = new Scanner(System.in);
    public boolean run() {

        cpu.menu();
        try {
            choice = sc.nextInt();
            sc.nextLine();
        } catch(InputMismatchException mis) {
            sc.nextLine();
            cpu.invalidOption();
        }

        switch(choice) {
            case 1:
                createAccount();
                scan.reset();
                break;
            case 2:
                login();
                scan.reset();
                break;
            case 3:
                exit();
                break;
            default:
                break;
        }
        return true;
    }
}