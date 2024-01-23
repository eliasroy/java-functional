package com.expressions.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class expressionsLambda {
    public static void main(String[] args) {
        /**
         * print a list using  expressions lambda such as forEach and using reference method
         */
        List.of("Hello", "World").forEach(System.out::println);

        ArrayList<Integer> smallerList = new ArrayList<>();

        /**
         * filter numbers granter than 5 and add smallerList
         */
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().filter(number -> number > 5).forEach(smallerList::add);
        ArrayList<Integer> mayores=(ArrayList<Integer>) List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().
                filter(number -> number > 5).collect(Collectors.toList());

        System.out.println(smallerList);
        System.out.println(mayores);

    }
}
