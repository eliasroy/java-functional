package streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> list = List.of("java", "full stack", "frontend", "backend", "python", "c++", "c#", "c", "javascript", "php", "ruby", "go", "swift", "kotlin", "rust", "scala", "elixir", "groovy", "dart", "f#", "haskell");

        Stream<String> streamss =Stream.of("java", "full stack", "frontend", "backend", "python", "c++", "c#", "c", "javascript", "php", "ruby", "go", "swift", "kotlin", "rust", "scala", "elixir", "groovy", "tream");

       // Stream<Integer> size= streamss.map(curso->curso.length());

       // Optional<Integer> logest=size.max(Integer::compare);

        Stream<String> enfhasis=streamss.map(c->c+"!");
        Stream<String> justJava=enfhasis.filter(c->c.contains("java"));
        justJava.forEach(System.out::println);
    }
}
