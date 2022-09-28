package task5;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args){
        Stream<String> stream1 = Stream.of("A","C","D","B","Q");
        Stream<String> stream2 = Stream.of("1f","8k","2d");
        zip(stream1,stream2).forEach(System.out::println);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> result = Stream.concat(first,second).collect(Collectors.toList());
        Collections.shuffle(result);
        return result.stream();
    }
}
