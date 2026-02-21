package functionalInterface;

import java.util.List;
import java.util.function.BinaryOperator;

public class FunctionalInterfaceBehindReduce {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        BinaryOperator<Integer> sum1 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer num1, Integer num2) {
                return num1+num2;
            }
        };

        int sum = numbers.stream()
                .reduce(0, sum1);

        System.out.println("Sum of First 10 natural numbers : "+sum);

    }
}
