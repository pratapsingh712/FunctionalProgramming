package groupingCoursesIntoMap;

import objectStream.Course;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Experiment {
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

        // let's try and get courses whose category is microservices store name as key and value as list

        System.out.println(
                courseList.stream()
                        .filter(course -> course.getCategory().equals("Framework"))
                        .collect(Collectors.groupingBy(course -> course.getCategory(),Collectors.groupingBy(course -> course.getCategory())))
        );

        Map<String,List<Course>> getFrameworkCourses = courseList.stream()
                .filter(course -> course.getCategory().equals("Framework"))
                .collect(Collectors.groupingBy(course -> course.getCategory()));

        System.out.println(getFrameworkCourses);
    }
}
