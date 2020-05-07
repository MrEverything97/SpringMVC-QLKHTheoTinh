package com.phuongnam.service;

import com.phuongnam.model.Customer;

public interface CustomerService {
     Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}