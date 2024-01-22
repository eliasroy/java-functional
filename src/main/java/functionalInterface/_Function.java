package functionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        /**
         * here use a function with a method apply this receive an int , this funciona incremento by 1
         */
        int increment3 = incrementByOneFunction.apply(1);
        System.out.println(increment3);
        /**
         * here we use a function that multiply by 10
         */
        int multiply = multiplyBy10Function.apply(increment3);
        System.out.println(multiply);

        /**
         * here create a function that increment a number by 1 and then multiply by 10, using a past functions
         */
        Function<Integer,Integer> addBy1AndThenMultiplyBy10 =incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println( addBy1AndThenMultiplyBy10.apply(4));
    }

    /**
     * this a function that takes an int and returns an int
     */
    static Function<Integer,Integer> incrementByOneFunction= number->number+1;

    /**
     * this fuction multiply a number by 10 and return that result
     */
    static Function<Integer,Integer> multiplyBy10Function= number->number*10;
    /**
     * this a simple method that takes an int and returns an int
     * @param num
     * @return
     */
    static int incrementByOne(int num){
        return num + 1;
    }
}
