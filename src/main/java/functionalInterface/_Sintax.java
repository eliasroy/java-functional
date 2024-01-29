package functionalInterface;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class _Sintax {
    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "c");
        list.forEach(System.out::println); // method reference

        useZero(()->0);
        usePedicate(s->s.length()>0);
        useBiFunction((s1,s2)->s1+s2);
        useBiFunction((s1,s2)->{
            System.out.println(s1);
            System.out.println(s2);
            return s1+s2;
        });

        usenada(()->System.out.println("nada"));

       // useBiFunction((int s1,int s2)->s1+s2);
    }

    static void useZero(ZeroArguments zeroArguments){

    }
    static void usePedicate(Predicate<String> predicate){

    }
    static void useBiFunction(BiFunction<Integer,Integer,Integer> biFunction){

    }
    static void usenada(nathing nada){

    }

    @FunctionalInterface
    interface ZeroArguments{
        int get();
    }
    @FunctionalInterface
    interface nathing{
        void nada();
    }




}
