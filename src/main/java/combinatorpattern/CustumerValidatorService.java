package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustumerValidatorService
{
    private boolean isEmailValid(String email)
    {
        return email.contains("@");
    }
    private boolean isPhoneNumberValid(String phoneNumber)
    {
        return phoneNumber.startsWith("+0");
    }
    private boolean isAdult(LocalDate dob)
    {
        return Period.between(dob,LocalDate.now()).getYears()>18;
    }

    public boolean isValid(Custumer custumer)
    {
        return isEmailValid(custumer.getEmail()) && isPhoneNumberValid(custumer.getPhoneNumber()) && isAdult(custumer.getDob());
    }
}
