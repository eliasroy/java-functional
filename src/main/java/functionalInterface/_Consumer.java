package functionalInterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //method simple
        greetCustomer(new Customer("ELIAS","999999999"));

        //consumer functional interface
        greetCustomerConsumer.accept(new Customer("ELIAS","999999999"));

    }


    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.custumerName + ", thanks for registering phone number " + customer.custumerPhoneNumber);


    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.custumerName + ", thanks for registering phone number " + customer.custumerPhoneNumber);
    }
    static class Customer{
        private final String custumerName;
        private final String custumerPhoneNumber;


        Customer(String custumerName, String custumerPhoneNumber) {
            this.custumerName = custumerName;
            this.custumerPhoneNumber = custumerPhoneNumber;
        }
    }
}
