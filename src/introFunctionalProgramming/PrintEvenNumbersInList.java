package introFunctionalProgramming;

import java.util.List;

public class PrintEvenNumbersInList {
    public static void main(String[] args) {

        printEvenNumbersInListStructured(List.of(1,2,3,4,5,6,7,8,9,10));
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
//        for(int num : numbers){
//            if(num%2==0){
//                System.out.print(num+",");
//            }
//        }
//        System.out.println();

        numbers.stream()
//                .filter(PrintEvenNumbersInList::isEven)// filter - only even numbers
                .filter(number->number%2==0) // lambda expression
                .forEach(System.out::println);//method reference
    }

//    public static boolean isEven(int num){
//        return num%2==0;
//    }
}
