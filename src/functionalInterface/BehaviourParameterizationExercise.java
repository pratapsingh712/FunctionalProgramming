package functionalInterface;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviourParameterizationExercise {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> squares = extractSquare(numbers,num -> num*num);

        System.out.println("Square of numbers is : "+squares);

        System.out.println("***********************************");

        List<Integer> cubeElements = extractSquare(numbers,num->num*num*num);
        System.out.println("Cube of numbers is : "+cubeElements);
    }

    private static List<Integer> extractSquare(List<Integer> numbers, Function<Integer,Integer> function){
        return numbers.stream()
                .map(function)
                .collect(Collectors.toList());
    }
}
