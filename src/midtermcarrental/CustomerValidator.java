package midtermcarrental;


//implemented oop concept of encapsulation
//separated the customer validation class and invoked in main test method
public class CustomerValidator {
    public boolean isValidCustomer(int birthYear) {
        return (2023 - birthYear) >= 21;
    }
}