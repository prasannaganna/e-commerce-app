package com.stschool.ecommerce.repository;

import com.stschool.ecommerce.model.Customer;

public class CustomerRepository {
    public Customer addNewCustomer(Customer customer){
        System.out.println("New customer add sucessfully");
        System.out.println("customer details: " + customer);
        return  customer;
    }
}
