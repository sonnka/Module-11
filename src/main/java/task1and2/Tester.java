package task1and2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tester {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Tom","Ann","Kate","Michael","Olga","George","Nick");
        System.out.println("--------- Task 1 --------");
        getOddIndexedStrings(names);
        System.out.println("--------- Task 2 --------");
        List<String> result = getUpperCase(names);
        result.forEach(System.out::println);
    }
    public static void getOddIndexedStrings(List<String> list) {
         IntStream
                .range(0, list.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> String.join(". ",String.valueOf(i),list.get(i)))
                .forEach(System.out::println);
    }
    public static List<String> getUpperCase(List<String> list){
        return list
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
