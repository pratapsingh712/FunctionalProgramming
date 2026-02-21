package objectStream;

import javax.print.attribute.standard.Compression;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class AggregateFunction {
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

        Course getMaxReviewCourse = courseList.stream()
                .max(Comparator.comparing(Course::getReviewScore))
                .orElse(null);

        System.out.println(getMaxReviewCourse);

        Course getMinReviewCourse = courseList.stream()
                .distinct()
                .sorted(Comparator.comparing(Course::getCategory))
                        .min(Comparator.comparing(Course::getReviewScore))
                                .orElse(null);

        System.out.println("*****************************************");

        System.out.println(getMinReviewCourse);

        System.out.println("*****************************************");

        List<Course> getList = courseList.stream()
                .distinct()
                .sorted(Comparator.comparing(Course::getReviewScore))
                .toList();

        getList.forEach(System.out::println);

        System.out.println("*****************************************");

        Predicate<Course> reviewScoreLessThan90 = course -> course.getReviewScore()<90;

        Comparator<Course> comparingByNoOfStudentAndNoOfReviews =
                Comparator.comparing(Course::getNoOfStudents)
                        .thenComparing(Course::getReviewScore)
                        .reversed();

        System.out.println(
                courseList.stream()
                        .filter(reviewScoreLessThan90)
                        .min(comparingByNoOfStudentAndNoOfReviews)
                        .orElse(new Course("Kubernetes","Cloud",91,20000))
        );

        // default value for course is set to kubernetes

        System.out.println("*****************************************");

        System.out.println(
                courseList.stream()
                        .filter(reviewScoreLessThan90)
                        .findFirst()
        );

        System.out.println("*****************************************");

        Predicate<Course> reviewScoreGreaterThan95 = course -> course.getReviewScore()>=95;

        System.out.println(
                courseList.stream()
                        .sorted(Comparator.comparing(Course::getCategory))
                        .filter(reviewScoreGreaterThan95)
                        .findFirst()
        );

        System.out.println("*****************************************");

        System.out.println(
                courseList.stream()
                        .filter(reviewScoreGreaterThan95)
                        .findAny()
        );

        System.out.println("*****************************************");

        System.out.println("Total student enrolled in courses having review score greater than 95 :");

        System.out.println(
                courseList.stream()
                        .filter(reviewScoreGreaterThan95)
                        .mapToInt(Course::getNoOfStudents)
                        .sum()
        );


        System.out.println("*****************************************");

        System.out.println("Average No of student enrolled in courses having review score greater than 95 :");

        System.out.println(
                courseList.stream()
                        .filter(reviewScoreGreaterThan95)
                        .mapToInt(Course::getNoOfStudents)
                        .average()
        );

        System.out.println("*****************************************");

        System.out.println("Total courses having review score greater than 95 :");

        System.out.println(
                courseList.stream()
                        .filter(reviewScoreGreaterThan95)
                        .count()
        );
    }
}
