package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Prdicate
{
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("990099009a"));

        // using predicate
        System.out.println(isPhoneNumberValidPredicate.test("990099009a"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber0).test("990099009"));
        //using bipredicate
        System.out.println(biPredicate.test("990099009","99"));
    }

    static boolean  isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("99") && phoneNumber.length()==9;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("99") && phoneNumber.length()==9;

    static Predicate<String> containsNumber0 = number->
            number.contains("1");
    static BiPredicate<String,String> biPredicate =
            (number,prefix) -> number.startsWith(prefix);
}
