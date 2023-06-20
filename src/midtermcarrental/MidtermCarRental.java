package midtermcarrental;

import java.util.Scanner;

public class MidtermCarRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Software Fundamentals Car Rental System");
        System.out.println("Please enter the following questions to proceed with creating an account:");
        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please enter your year of birth:");
        int birthYear = sc.nextInt();

        CustomerValidator customerValidator = new CustomerValidator();
        if (customerValidator.isValidCustomer(birthYear)) {
            Customer newCustomer = new Customer(lastName, firstName, birthYear);
            System.out.println("Account created, let's get a car for you...");
            // Note that this is as far as the code is meant to go for the midterm question!
        } else {
            System.out.println("I'm sorry but you must be at least 21 in order to create an account");
        }
    }
}