package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //method simple
        greetCustomer(new Customer("ELIAS","999999999"));

        //consumer functional interface
        greetCustomerConsumer.accept(new Customer("ELIAS","999999999"));
        //biconsumer
        greetCustomerConsumer2.accept(new Customer("ELIAS","999999999"),false);


    }


    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.custumerName + ", thanks for registering phone number " + customer.custumerPhoneNumber);
    static BiConsumer<Customer, Boolean> greetCustomerConsumer2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.custumerName + ", thanks for registering phone number " +( showPhoneNumber ? customer.custumerPhoneNumber:" "));



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
