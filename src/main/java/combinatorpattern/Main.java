package combinatorpattern;

import functionalInterface._Consumer;

import java.beans.Customizer;
import java.time.LocalDate;

import static combinatorpattern.CustumerResgistrationValidator.*;

public class Main
{
    public static void main(String[] args) {
        Custumer customer = new Custumer(
                "Alice",
                "alicegmil.com",
                "+0122345",
                LocalDate.of(2000,1,1)
        );

        // validatorService = new CustumerValidatorService();

       // System.out.println( validatorService.isValid(customer));

        //if valid we can store custumer in db

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }




    }
}
