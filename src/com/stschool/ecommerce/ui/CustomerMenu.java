package com.stschool.ecommerce.ui;

import com.stschool.ecommerce.model.Customer;

import java.util.Scanner;

public class CustomerMenu {
    public Customer inputCustomerSignUpData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the id: ");
        String id = scanner.next();
        System.out.println(" enter the Firstname: ");
        String firstName = scanner.next();
        System.out.println("enter the Lastname: " );
        String lastName = scanner.next();
        System.out.println(" enter the email: ");
        String email = scanner.next();
        System.out.println("enter the contactnumber: ");
        String contactNumber = scanner.next();
        System.out.println("enter the the password: ");
        String passWord = scanner.next();
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setContactNumber(contactNumber);
        customer.setPassWord(passWord);
        scanner.close();
        return customer;
    }

}
