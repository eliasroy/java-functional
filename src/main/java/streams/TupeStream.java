package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TupeStream
{
    public static void main(String[] args) {
        IntStream infiniteStream=IntStream.iterate(0,i->i+1);

        List<Integer> list=infiniteStream.limit(10)
                .parallel()
                .filter(i->i%2==0)
                .boxed()
                .collect(Collectors.toList());

    }
}
