package functionalInterface;

import java.util.function.Function;

public class _Compose {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyby3 = (Integer x) -> x * 3;

        Function<Integer, Integer> add1multiplyby3=multiplyby3
                .compose(x -> {
                    System.out.println("Compose " + x);
                    return x + 1;
                });

        System.out.println(add1multiplyby3.apply(2));
    }
}
