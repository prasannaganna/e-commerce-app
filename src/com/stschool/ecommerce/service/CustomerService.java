package com.stschool.ecommerce.service;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;

public class CustomerService {
    public CustomerRepository customerRepository;

    public CustomerService(){
        customerRepository = new CustomerRepository();
    }
    public Customer handleSignUp(Customer customer){
        System.out.println("customer service: " +customer);
        return customerRepository.addNewCustomer(customer);
    }
    public  void displayCustomerDetails(Customer customer){
        System.out.println("id : "+ customer.getId());
        System.out.println("firstname : " + customer.getFirstName());
        System.out.println("lastname : " + customer.getLastName());
        System.out.println("email : " + customer.getEmail());
        System.out.println("contact number : " +customer.getContactNumber());
    }
    public void displayAllCustomerDetails(Customer[] customers){
        for(Customer customer : customers){
            displayCustomerDetails(customer);
        }
    }

    public Customer[] getAllCustomers(){
        return customerRepository.getAllCustomers();
    }

}
