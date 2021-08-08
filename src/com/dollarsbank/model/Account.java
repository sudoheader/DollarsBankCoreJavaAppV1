package com.dollarsbank.model;

public class Account {

    private double depositAmount;
    private double withdrawAmount;
    private double fundsTransfer;
    private String viewLastFiveTransactions;
    private String displayInfo;
    private Account account;

    public Account(double depositAmount, double withdrawAmount, double fundsTransfer, String viewLastFiveTransactions, String displayInfo, Account account) {
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
        this.fundsTransfer = fundsTransfer;
        this.viewLastFiveTransactions = viewLastFiveTransactions;
        this.displayInfo = displayInfo;
        this.account = account;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Account{" +
                "depositAmount=" + depositAmount +
                ", withdrawAmount=" + withdrawAmount +
                ", fundsTransfer=" + fundsTransfer +
                ", viewLastFiveTransactions='" + viewLastFiveTransactions + '\'' +
                ", displayInfo='" + displayInfo + '\'' +
                ", account=" + account +
                '}';
    }
}
