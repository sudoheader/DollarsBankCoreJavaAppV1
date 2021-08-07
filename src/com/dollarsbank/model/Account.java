package com.dollarsbank.model;

public class Account {

    private double depositAmount;
    private double withdrawAmount;
    private double fundsTransfer;
    private String viewLastFiveTransactions;
    private String displayInfo;

    public Account(double depositAmount, double withdrawAmount, double fundsTransfer, String viewLastFiveTransactions, String displayInfo) {
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
        this.fundsTransfer = fundsTransfer;
        this.viewLastFiveTransactions = viewLastFiveTransactions;
        this.displayInfo = displayInfo;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getFundsTransfer() {
        return fundsTransfer;
    }

    public void setFundsTransfer(double fundsTransfer) {
        this.fundsTransfer = fundsTransfer;
    }

    public String getViewLastFiveTransactions() {
        return viewLastFiveTransactions;
    }

    public void setViewLastFiveTransactions(String viewLastFiveTransactions) {
        this.viewLastFiveTransactions = viewLastFiveTransactions;
    }

    public String getDisplayInfo() {
        return displayInfo;
    }

    public void setDisplayInfo(String displayInfo) {
        this.displayInfo = displayInfo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "depositAmount=" + depositAmount +
                ", withdrawAmount=" + withdrawAmount +
                ", fundsTransfer=" + fundsTransfer +
                ", viewLastFiveTransactions='" + viewLastFiveTransactions + '\'' +
                ", displayInfo='" + displayInfo + '\'' +
                '}';
    }
}
