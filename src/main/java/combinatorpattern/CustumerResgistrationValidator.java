package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static combinatorpattern.CustumerResgistrationValidator.*;

public interface CustumerResgistrationValidator extends Function<Custumer, ValidationResult> {

    static CustumerResgistrationValidator esEmailValid(){
        return custumer -> custumer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }
    static CustumerResgistrationValidator isPhoneNumberValid(){
      return custumer -> custumer.getPhoneNumber().startsWith("+0") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }
    static CustumerResgistrationValidator isAdult(){
      return custumer -> Period.between(custumer.getDob(), LocalDate.now()).getYears() > 16  ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_AN_ADULT;
    }
enum ValidationResult{
   SUCCESS,
    PHONE_NUMBER_NOT_VALID,
    EMAIL_NOT_VALID,
    IS_NOT_AN_ADULT
}
}
