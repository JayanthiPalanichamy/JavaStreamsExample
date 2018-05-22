package main.java;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class ArrayListStreams {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(10,6,10);
//        List<Integer> mapperList = arrayList.stream().map(x -> x+2).filter(x -> x>5).collect(Collectors.toList());
//        System.out.println(mapperList);
        System.out.println(arrayList.stream().mapToInt(Integer::intValue).reduce((a,b) -> a<b ? a : b ));
        arrayList.stream().mapToInt(Integer::intValue).limit(0).forEach(x -> System.out.println(x));
        System.out.println(Stream.iterate(1, x -> x+1).filter(x-> x%2==0).skip(3).limit(10).collect(toList()));
        System.out.println(Stream.iterate(new int[]{0,1}, x -> new int[]{x[1],x[0]+x[1]}).limit(10).map(x->x[0]).collect(toList()));
        List<Integer> evenList = Arrays.asList(6,8,10);
        List<Integer> oddList = Arrays.asList(61,63,65);
        List<List<Integer>> numberList = new ArrayList<>();
        numberList.add(evenList);
        numberList.add(oddList);
        System.out.println(numberList);
        System.out.println(numberList.stream().flatMap(x->x.stream()).map(x->x+1).collect(toList()));
//       IntStream.range(1,100).forEach(System.out::println);
//        System.out.println(IntStream.range(1,100));
        Optional<Integer> optionalInteger=Optional.empty();
        System.out.println(optionalInteger.isPresent());

    }
}
