package com.dollarsbank.utility;

public class ConsolePrinterUtility extends ColorsUtility {

    public static void printToConsole() {

//        System.out.println(ColorsUtility.BLUE + "BLUE COLOR");
        String welcome = "DOLLARSBANK Welcomes You!";
        String enterDetails = "Enter Details For New Account";
        String enterLogin = "Enter Login Details";
        String welcomeCustomer = "WELCOME Customer!!!";
        String recentTransactions = "5 Recent Transactions:";

        printMessage(welcome);
        printMessage(enterDetails);
        printMessage(enterLogin);
        printMessage(welcomeCustomer);
        printMessage(recentTransactions);
        
        menu();
        registration();
        credentials();
        authenticated();
        transactions();
        choice(); // will need a second one after login
        userInput();
    }

    //FIXME: probably need to be public
    private static void userInput() {
        //TODO: fill out the rest
        System.out.println(ColorsUtility.CYAN);
    }

    private static void choice() {
        //TODO: fill out the rest
        System.out.println(ColorsUtility.GREEN);
        System.out.println("Enter Choice (1,2, or 3) :");
        System.out.println(ColorsUtility.RESET);
    }

    private static void transactions() {
        //TODO: fill out the rest
        System.out.println(ColorsUtility.RESET);
    }

    private static void authenticated() {
        //TODO: fill out the rest
        System.out.println(ColorsUtility.RESET);
    }

    private static void credentials() {
        //TODO: fill out the rest
        System.out.println(ColorsUtility.RESET);
        // when error, make it red
        System.out.println(ColorsUtility.RED + "Invalid Credentials. Try Again!");
    }

    private static void registration() {
        //TODO: fill out the rest
        System.out.println(ColorsUtility.RESET);
    }

    public static void menu() {
        //TODO: fill out the rest
        System.out.println(ColorsUtility.RESET);
        System.out.println("1. Create New Account");
        System.out.println("2. Login");
        System.out.println("3. Exit\n");

        choice();
    }

    private static void printMessage(String msg) {
        System.out.print(ColorsUtility.BLUE + "+");
        int msgFormat = msg.length() + 2;
        for(int i = 0; i < msgFormat; i++) {
            System.out.print("-");
        }
        System.out.print("+\n| " + msg + " |\n+");
        for(int i = 0; i < msgFormat; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
