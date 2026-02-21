package functionalInterface;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Integer> randomInteger = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };

        System.out.println("Random Integer is : "+randomInteger.get());

        UnaryOperator<Integer> unaryOperator = (num) -> num*3;

        System.out.println("Number multiplied with 3 is = "+unaryOperator.apply(3));
    }
}
