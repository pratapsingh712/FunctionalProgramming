package streamOperations;

import java.util.Comparator;
import java.util.List;

public class DistinctAndSortedOperation {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(5,4,3,2,1,1,2,3,4,5);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("***************************");

        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCS","Azure","Docker","Kubernetes");

        System.out.println("************************");

        String course = courses.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();

        System.out.println("Second course should be Spring "+course);

        System.out.println("***************************************");

        // sorting using comparator

        System.out.println("Natural Order Sorting ");
        courses.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        System.out.println("**************************************");
        System.out.println("Reverse order sorting :");
        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // now we want to sort based on string length

        System.out.println("********************************");

        System.out.println("Printing courses based on length of string in reverse :");
        courses.stream()
                .map(cours->cours.length()+" "+cours)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);

        System.out.println("*****************************");

    }
}
