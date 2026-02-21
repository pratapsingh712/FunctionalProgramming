package higherOrderFunction;

import objectStream.Course;

import java.util.List;
import java.util.function.Predicate;

public class HigherOrderFunction {
    public static void main(String[] args) {
        List<Course> courseList = List.of(
                new Course("Spring","Framework",98,20000),
                new Course("Spring Boot","Framework",95,18000),
                new Course("API","Microservices",97,22000),
                new Course("Microservices","Microservices",96,20000),
                new Course("FullStack","FullStack",91,25000),
                new Course("AWS","Cloud",92,14000),
                new Course("Azure","Cloud",99,21000),
                new Course("Docker","Cloud",92,20000),
                new Course("Kubernetes","Cloud",91,20000)
        );
        
        // we want to check if review score is higher than 90 or 95 create two function

        Predicate<Course> getReviewScoreHigherThan95 =
                getReviewScore(95);

        Predicate<Course> getReviewHigherThan90 =
                getReviewScore(90);

        courseList.stream()
                .filter(getReviewScoreHigherThan95)
                .forEach(System.out::println);

        System.out.println("****************************************");

        courseList.stream()
                .filter(getReviewHigherThan90)
                .forEach(System.out::println);

        System.out.println("**********************************************");

        String result = courseList.stream()
                .peek(System.out::println)
                .filter(course -> course.getName().length()>=11)
                .map(course -> course.getName().toUpperCase())
                .peek(System.out::println)
                .findFirst()
                .orElse("Not found");

        System.out.println(result);
    }

    private static Predicate<Course> getReviewScore(int reviewScore) {
        return course -> course.getReviewScore()>=reviewScore;
    }
}
