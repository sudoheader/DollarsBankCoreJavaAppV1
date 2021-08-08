package com.dollarsbank.model;

public class Customer {
    private String name;
    private String address;
    private String contact;
    private String userId;
    private String password;
    private Account account;

    public Customer(String name, String address, String contact, String userId, String password, Account account) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.userId = userId;
        this.password = password;
        this.account = account;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", account=" + account +
                '}';
    }
}
