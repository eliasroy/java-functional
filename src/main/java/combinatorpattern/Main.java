package combinatorpattern;

import functionalInterface._Consumer;

import java.beans.Customizer;
import java.time.LocalDate;

public class Main
{
    public static void main(String[] args) {
        Custumer customer = new Custumer(
                "Alice",
                "alice@gmil.com",
                "+0122345",
                LocalDate.of(2000,1,1)
        );

        CustumerValidatorService validatorService = new CustumerValidatorService();

        System.out.println( validatorService.isValid(customer));

        //if valid we can store custumer in db



    }
}
