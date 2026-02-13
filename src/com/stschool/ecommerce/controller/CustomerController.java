package com.stschool.ecommerce.controller;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.service.CustomerService;

import java.util.concurrent.Callable;

public class CustomerController {
    CustomerService customerService;

    public CustomerController() {
        customerService = new CustomerService();
    }
    public Customer handleSignUp(Customer customer){
        System.out.println("handling the data : " +customer.getFirstName());
        CustomerService customerService = new CustomerService();
        customerService.handleSignUp(customer);
        return customer;
    }
    public Customer[] getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
