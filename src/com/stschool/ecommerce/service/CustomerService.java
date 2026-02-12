package com.stschool.ecommerce.service;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;

public class CustomerService {
    public Customer handleSignUp(Customer customer){
        System.out.println("customer service: " +customer);
        CustomerRepository customerRepository =  new CustomerRepository();
        return customerRepository.addNewCustomer(customer);
    }
    public  void displayCustomerdetails(Customer customer){
        System.out.println("id : "+ customer.getId());
        System.out.println("firstname : " + customer.getFirstName());
        System.out.println("lastname : " + customer.getLastName());
        System.out.println("email : " + customer.getEmail());
        System.out.println("contact number : " +customer.getContactNumber());

    }

}
