package com.dollarsbank.utility;

public class ConsolePrinterUtility {

    ColorsUtility color = new ColorsUtility();

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
    public void exit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    //FIXME: probably need to be public
    public void userInput() {
        System.out.println(color.CYAN);
    }

    public void userChoice() {
        System.out.print(color.RESET);
    }

    public void choice() {
        System.out.println("1. Create New Account");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.println(color.GREEN);
        System.out.println("Enter Choice (1,2, or 3) :" + color.WHITE + "");
        userChoice();
    }

    public void transactions() {
        printMessage(recentTransactions);
    }

    public void loggedIn() {
        printMessage(welcomeCustomer);
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Funds Transfer");
        System.out.println("4. View 5 Recent Transactions");
        System.out.println("5. Display Customer Information");
        System.out.println("6. Sign out\n");
        System.out.println(color.GREEN);
        System.out.println("Enter Choice (1,2,3,4,5 or 6) :");
        System.out.println(color.RESET);
    }

    public void credentials() {
        printMessage(enterLogin);
        System.out.println("User Id :");
        System.out.println("Password :");
        // when error, make it red
        System.out.println(color.RED + "Invalid Credentials. Try Again!");
    }

    public void registration() {
        System.out.println();
        printMessage(enterDetails);
        System.out.println("Customer Name:");
        System.out.println("Customer address:");
        System.out.println("Customer Contact Number:");
        System.out.println("User Id :");
        System.out.println("Password : 8 Characters With Lower,Upper & Special");
        System.out.println("Initial Deposit Amount");
    }

    public void menu() {
        printMessage(welcome);
        choice();
    }

    private void printMessage(String msg) {
        System.out.print(color.BLUE + "+");
        int msgFormat = msg.length() + 2;
        for(int i = 0; i < msgFormat; i++) {
            System.out.print("-");
        }
        System.out.print("+\n| " + msg + " |\n+");
        for(int i = 0; i < msgFormat; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print(color.RESET);
    }
}
