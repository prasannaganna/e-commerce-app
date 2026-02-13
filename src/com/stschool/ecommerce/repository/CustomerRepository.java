package com.stschool.ecommerce.repository;

import com.stschool.ecommerce.model.Customer;

public class CustomerRepository {

    Customer[] customers;
    int index = 0;

    public CustomerRepository() {
        customers = new Customer[4];
        initialCustomers();
    }

    public Customer addNewCustomer(Customer customer) {
        System.out.println("New customer add sucessfully");
        System.out.println("customer details: " + customer);
        customers[++index] = customer;
        return customer;
    }
    public Customer[] getAllCustomers(){
        return customers;
    }
    public void initialCustomers(){
        customers[index] = new Customer();
        customers[index].setId("Cust-111");
        customers[index].setFirstName("Cust-111");
        customers[index].setLastName("Cust-111");
        customers[index].setEmail("customer1@gmail.com");
        customers[index].setPassWord("customer1");
        customers[index].setContactNumber("1111111111");
        index++;
        customers[index] = new Customer();
        customers[index].setId("Cust-222");
        customers[index].setFirstName("Cust-222");
        customers[index].setLastName("Cust-222");
        customers[index].setEmail("customer222@gmail.com");
        customers[index].setPassWord("customer222");
        customers[index].setContactNumber("2222222");
        index++;
        customers[index] = new Customer();
        customers[index].setId("Cust-333");
        customers[index].setFirstName("Cust-333");
        customers[index].setLastName("Cust-333");
        customers[index].setEmail("customer3@gmail.com");
        customers[index].setPassWord("customer333");
        customers[index].setContactNumber("3333333");


    }
}
