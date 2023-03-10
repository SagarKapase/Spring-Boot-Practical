package com.usingmongo.service;

import com.usingmongo.dto.CustomerDTO;

public interface CustomerService {

    //method to access data access layer method to insert Customer record
    public void insertCustomer(CustomerDTO customerDTO);

    //Method to access data access layer method to remove a record
    public void removeCustomer(long phoneNumber);
}
