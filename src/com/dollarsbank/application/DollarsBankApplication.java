package com.dollarsbank.application;

import com.dollarsbank.controller.DollarsBankController;

public class DollarsBankApplication {

    public static void main(String[] args) {

        boolean testCase = true;
        DollarsBankController dbc = new DollarsBankController();
        do {
            testCase = dbc.run();
        } while(testCase);
    }
}
