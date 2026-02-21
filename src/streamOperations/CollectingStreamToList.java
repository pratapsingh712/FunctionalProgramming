package streamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class CollectingStreamToList {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> squareElements = doubleList(numbers);

        System.out.println("Square of all the numbers in the list will be ");

        System.out.println(squareElements);

        System.out.println("********************************");

        List<Integer> evenElements = getAllEvenElemenetsFromList(numbers);

        System.out.println("All the even numbers in the list are :"+evenElements);

        System.out.println("********************************************");

        System.out.println("Course Length :");

        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCS","Azure","Docker","Kubernetes");

        List<Integer> courseLengthList = getAllCourseLengthList(courses);

        System.out.println(courseLengthList);

    }

    private static List<Integer> getAllCourseLengthList(List<String> courses) {
        return courses.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    private static List<Integer> getAllEvenElemenetsFromList(List<Integer> numbers) {

        return numbers.stream()
                .filter(num->num%2==0)
                .collect(Collectors.toList());
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .map(num->num*num)
                .collect(Collectors.toList());
//                .toList();
    }
}
