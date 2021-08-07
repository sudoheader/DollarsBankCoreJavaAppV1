package com.dollarsbank.dao;

import com.dollarsbank.model.Customer;

public interface CustomerDao {

    public Customer getName(String name);
    public Customer getAddress(String address);
    public Customer getContact(String contact);
    public Customer getUserId(String userId);
    public Customer getPassword(String password);
    public Customer getInitialAmount(double initialAmount);

}
