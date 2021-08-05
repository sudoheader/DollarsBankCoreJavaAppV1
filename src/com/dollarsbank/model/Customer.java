package com.dollarsbank.model;

public class Customer {
    private String name;
    private String address;
    private String contact;
    private String userId;
    private String password;
    private double initialAmount;

    public Customer(String name, String address, String contact, String userId, String password, double initialAmount) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.userId = userId;
        this.password = password;
        this.initialAmount = initialAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", initialAmount=" + initialAmount +
                '}';
    }
}
