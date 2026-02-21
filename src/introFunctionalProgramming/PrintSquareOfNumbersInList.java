package introFunctionalProgramming;

import java.util.List;

public class PrintSquareOfNumbersInList {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Square of even numbers from the list is : ");
        printSquareOfEvenNumbers(numbers);

        System.out.println("********************************************");
        System.out.println("Cube of odd numbers from the list is :");
        printCubeOfOddNumbers(numbers);

        System.out.println("**********************************************");
        List<String> courses = List.of("spring","spring boot","api","microservices","pcf","azure","docker","kubernetes");
        printCharacterLengthOfCourses(courses);

    }

    private static void printCharacterLengthOfCourses(List<String> courses) {
        courses.stream()
                .map(course -> course+" has length : "+course.length())
                .forEach(System.out::println);
    }

    private static void printCubeOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(num->num%2!=0)
                .map(num->num*num*num)
                .forEach(System.out::println);
    }

    private static void printSquareOfEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num%2==0)
                .map(num->num*num)
                .forEach(System.out::println);

    }
}
