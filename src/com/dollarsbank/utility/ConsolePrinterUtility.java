package com.dollarsbank.utility;

public class ConsolePrinterUtility implements ColorsUtility {

    static String welcome = "DOLLARSBANK Welcomes You!";
    static String enterDetails = "Enter Details For New Account";
    static String enterLogin = "Enter Login Details";
    static String welcomeCustomer = "WELCOME Customer!!!";
    static String recentTransactions = "5 Recent Transactions:";

    public static void printToConsole() {

//        System.out.println(ColorsUtility.BLUE + "BLUE COLOR");

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
    public static void userInput() {
        System.out.println(ColorsUtility.CYAN);
    }

    public static void choice() {
        System.out.println(ColorsUtility.RESET);
        System.out.println("1. Create New Account");
        System.out.println("2. Login");
        System.out.println("3. Exit\n");
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
        System.out.println(ColorsUtility.RESET);
        printMessage(enterDetails);
        System.out.println("Customer Name:");
        System.out.println("Customer address:");
        System.out.println("Customer Contact Number:");
        System.out.println("User Id :");
        System.out.println("Password : 8 Characters With Lower,Upper & Special");
        System.out.println("Initial Deposit Amount");
    }

    public static void menu() {
        printMessage(welcome);
        System.out.println(ColorsUtility.RESET);

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
