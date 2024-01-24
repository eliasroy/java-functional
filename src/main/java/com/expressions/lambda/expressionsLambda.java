package com.expressions.lambda;

import com.expressions.lambda.model.Student;

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
        System.out.println(":::::::::::::::::");
        List<String> students = List.of("John", "Jane", "Jim", "Jill", "Jack", "Joe","ANUEL","PEDRO");

        //listar
        students.stream().forEach(a-> System.out.println(a));

        System.out.println(":::::::::::::::::");
        //LISTAR CON NOMBRE QUE COMIENZE CON LA LETRA ESPECIFICA

        students.stream().filter(c->c.startsWith("A")|| c.startsWith("P")).forEach(a-> System.out.println(a));
        System.out.println(":::::::::::::::::");

        //numero de alumnos
        System.out.println(( long) students.size());

        System.out.println(":::::::::::::::::");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // max number
        numbers.stream().max(Integer::compare).ifPresent(System.out::println);
        System.out.println(":::::::::::::::::");

        //min number
        numbers.stream().min(Integer::compare).ifPresent(System.out::println);
        System.out.println(":::::::::::::::::");

        //first student
        students.stream().findFirst().ifPresent(System.out::println);
        System.out.println(":::::::::::::::::");


        //studen when his name finish with a letter m
        students.stream().filter(c->c.endsWith("m")).forEach(System.out::println);
        System.out.println(":::::::::::::::::");

        //studen when his name have whot letter a
        students.stream().filter(c->c.contains("a")).forEach(System.out::println);
        System.out.println(":::::::::::::::::");

        //studen when his sixze name is greater then 4
        students.stream().filter(c->c.length()>4).forEach(System.out::println);
        System.out.println(":::::::::::::::::");
    }
}
