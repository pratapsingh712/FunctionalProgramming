package functionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class BehaviourParameterization {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Even Elements :");
        extracted(numbers,num->num%2==0);

        System.out.println("Odd Elements :");
        extracted(numbers, num -> num%2!=0);
    }

    private static void extracted(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

}
