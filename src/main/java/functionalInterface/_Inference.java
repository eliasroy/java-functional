package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class _Inference {
    public static void main(String[] args) {

        Function<Integer, String> converterFunction=
                integer-> String.valueOf(integer);

        List<String> list=_Refrerence.getList("juan","hugo","luis");

        list.forEach((String name)->System.out.println(name));
        list.forEach(name->System.out.println(name));
        list.forEach(System.out::println);

    }
}
