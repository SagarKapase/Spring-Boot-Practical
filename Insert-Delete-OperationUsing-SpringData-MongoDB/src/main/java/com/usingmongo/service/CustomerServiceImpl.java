package com.usingmongo.service;

import com.usingmongo.dto.CustomerDTO;
import com.usingmongo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void insertCustomer(CustomerDTO Customer) {
        customerRepository.save(CustomerDTO.prepareCustomerEntity(Customer));
    }

    @Override
    public void removeCustomer(long phoneNumber) {
        customerRepository.deleteById(phoneNumber);
    }
}
