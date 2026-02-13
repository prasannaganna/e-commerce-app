import com.stschool.ecommerce.controller.CustomerController;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;
import com.stschool.ecommerce.service.CustomerService;
import com.stschool.ecommerce.ui.CustomerMenu;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        CustomerService customerService = new CustomerService();
        CustomerRepository customerRepository = new CustomerRepository();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.SignUP");
        System.out.println("display all the customer");
        System.out.println("enter your choice: ");
        int choice= scanner.nextInt();
        switch (choice){
            case 1:
                CustomerMenu customerMenu = new CustomerMenu();
                Customer customer = customerMenu.inputCustomerSignUpData();
                //CustomerController customerController = new CustomerController();
                 Customer newCustomer = customerController.handleSignUp(customer);
                //CustomerService customerService=new CustomerService();
                //System.out.println("you have succesfully register ");
                //System.out.println("Displaying  the Customer details");
                //customerService.displayCustomerDetails(customer);
                break;
            case 2:
                Customer[] customers = customerController.getAllCustomers();
                for(Customer cust : customers){
                    System.out.println(" -------------------");
                    System.out.println("Id : " + cust.getId());
                    System.out.println("First Name : " + cust.getFirstName());
                    System.out.println("Last Name : " + cust.getLastName());
                    System.out.println("Email : " + cust.getEmail() );
                    System.out.println("Password : " + cust.getPassWord());
                    System.out.println("Contact No : " + cust.getContactNumber());
                }
                break;
        }
        scanner.close();
    }
}
