package streamOperations;

import java.util.Comparator;
import java.util.List;

public class SquareAndSumListElement {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);

        int squareSum = numbers.stream()
                .map(num->num*num)
                .reduce(0,(a,b)->a+b);

        System.out.println("Sum of square of all the numbers = "+squareSum);

        int cubeSum = numbers.stream()
                .map(num->num*num*num)
                .reduce(0,(a,b)->a+b);

        System.out.println("Sum of cube of all the numbers = "+cubeSum);

        int oddSum = numbers.stream()
                .filter(num->num%2!=0)
                .reduce(0,(a,b)->a+b);

        System.out.println("Sum of odd numbers from the list = "+oddSum);

    }
}
