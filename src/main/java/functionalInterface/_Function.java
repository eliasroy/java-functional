package functionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        /**
         * here use a function with a method apply this receive an int
         */
        int increment3 = incrementByOneFunction.apply(1);
        System.out.println(increment3);

    }

    /**
     * this a function that takes an int and returns an int
     */
    static Function<Integer,Integer> incrementByOneFunction= number->number+1;

    /**
     * this a simple method that takes an int and returns an int
     * @param num
     * @return
     */
    static int incrementByOne(int num){
        return num + 1;
    }
}
