package introFunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintAllNumbersInList {

    public static void main(String[] args) {

        printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        // How to loop the numbers

//        for(int i : numbers){
//            System.out.print(i+",");
//        }

//        List<Integer> num = numbers.stream().collect(Collectors.toList());
//        System.out.println(num);

        numbers.stream()
                .forEach(System.out::println); // method reference

    }

//    private static void print(int num) {
//        System.out.println(num);
//    }
}
