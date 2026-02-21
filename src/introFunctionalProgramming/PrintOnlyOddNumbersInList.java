package introFunctionalProgramming;

import java.util.List;

public class PrintOnlyOddNumbersInList {
    public static void main(String[] args) {

        printOnlyOddNumbersInListStructured(List.of(1,2,3,4,5,6,7,8,9,10));
    }

    private static void printOnlyOddNumbersInListStructured(List<Integer> numbers) {

        numbers.stream()
                .filter(n->n%2!=0)
                .forEach(System.out::println);
    }
}
