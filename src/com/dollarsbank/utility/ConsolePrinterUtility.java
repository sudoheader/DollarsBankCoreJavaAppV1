package com.dollarsbank.utility;

public class ConsolePrinterUtility implements ColorsUtility {

    static String welcome = "DOLLARSBANK Welcomes You!";
    static String enterDetails = "Enter Details For New Account";
    static String enterLogin = "Enter Login Details";
    static String welcomeCustomer = "WELCOME Customer!!!";
    static String recentTransactions = "5 Recent Transactions:";

//    public static void printToConsole() {
//
//        menu();
//        registration();
//        credentials();
//        loggedIn();
//        transactions();
//        choice(); // will need a second one after login
//        userInput();
//    }
    public static void exit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    //FIXME: probably need to be public
    public static void userInput() {
        System.out.println(ColorsUtility.CYAN);
    }

    public static void userChoice() {
        System.out.print(ColorsUtility.RESET);
    }

    public static void choice() {
        System.out.println("1. Create New Account");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.println(ColorsUtility.GREEN);
        System.out.println("Enter Choice (1,2, or 3) :");
        userChoice();
    }

    public static void transactions() {
        printMessage(recentTransactions);
    }

    public static void loggedIn() {
        printMessage(welcomeCustomer);
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Funds Transfer");
        System.out.println("4. View 5 Recent Transactions");
        System.out.println("5. Display Customer Information");
        System.out.println("6. Sign out\n");
        System.out.println(ColorsUtility.GREEN);
        System.out.println("Enter Choice (1,2,3,4,5 or 6) :");
        System.out.println(ColorsUtility.RESET);
    }

    public static void credentials() {
        printMessage(enterLogin);
        System.out.println("User Id :");
        System.out.println("Password :");
        // when error, make it red
        System.out.println(ColorsUtility.RED + "Invalid Credentials. Try Again!");
    }

    public static void registration() {
        System.out.println();
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
        System.out.print(ColorsUtility.RESET);
    }
}
