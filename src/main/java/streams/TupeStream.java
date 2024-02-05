package streams;

import java.util.stream.IntStream;

public class TupeStream
{
    public static void main(String[] args) {
        IntStream infiniteStream=IntStream.iterate(0,i->i+1);

        infiniteStream.limit(10)
                .parallel()
                .filter(i->i%2==0)
                .forEach(System.out::println);


    }
}
