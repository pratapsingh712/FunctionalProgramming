package introFunctionalProgramming;

import java.util.List;

public class PrintAllCoursesIndividually {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCS","Azure","Docker","Kubernetes");

        courses.stream()
                .forEach(System.out::println);

        System.out.println("***********************************");

        System.out.println("Courses containing word spring:");

        printCoursesContainingWordSpring(courses);

        System.out.println("***********************************");

        printCoursesWithAtLeastFourLetters(courses);
    }

    private static void printCoursesWithAtLeastFourLetters(List<String> courses) {

        courses.stream()
                .filter(course -> course.length()>=4)
                .forEach(System.out::println);

    }

    private static void printCoursesContainingWordSpring(List<String> courses) {

        courses.stream()
                .filter(course->course.contains("Spring"))
                .forEach(System.out::println);
    }
}
