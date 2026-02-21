package functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionConsumer {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,5,6,7,8,9,10,4);

        Predicate<Integer> evenCheck = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return num%2==0;
            }
        };


        Predicate<Integer> integerPredicate = num -> num % 2 == 0;

        Consumer<Integer> println = System.out::println;

        Function<Integer, Integer> integerIntegerFunction = num -> num * num;

        numbers.stream()
                .distinct()
                .sorted()
                .filter(evenCheck)
                .map(integerIntegerFunction)
                .forEach(println);
    }
}
