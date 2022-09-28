package task4;

import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args){
        generate(0L,25214903917L, 11L,(long)Math.pow(2,48)).forEach(System.out::println);
    }

    public static Stream<Long> generate(long seed,long a, long c, long m){
        return Stream.iterate(seed, n -> ((a * n + c)%m))
                .limit(100);
    }
}
