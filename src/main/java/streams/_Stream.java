package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", MALE));

        Function<Person, String> personStringFunction = person -> person. name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = x -> System. out.println(x);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        //inferemce
       boolean si=people.stream()
                .anyMatch(person -> person.gender.equals(MALE));
        System.out.println(si);

        //no inference
        Predicate <Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean si2=people.stream()
                .anyMatch(personPredicate);
        System.out.println(si2);




    }


    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }


    }

    enum Gender {
        MALE,FEMALE
    }
}
