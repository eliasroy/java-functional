package functionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class _Refrerence {

    public static void main(String[] args) {
        List<String>names=getList("a","b","c");

        Consumer<String>consumer=System.out::println;
        names.forEach(consumer);

        //reference operators

        names.forEach(System.out::println);

    }
    static  <T>List<T>getList(T ... elements){
        return List.of(elements);
    }

}
