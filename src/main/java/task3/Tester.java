package task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args){
        String[] array = new String[] {"1, 2, 0","4, 5"};
        System.out.println(convertToString(array));

    }
    public static String convertToString(String[] array){
        array = Arrays.stream(array).collect(Collectors.joining(", ")).split(", ");
        return Arrays.stream(array)
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
