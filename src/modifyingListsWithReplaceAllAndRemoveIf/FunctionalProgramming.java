package modifyingListsWithReplaceAllAndRemoveIf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalProgramming {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCS","Azure","Docker","Kubernetes");

        List<String> modifiableCourses = new ArrayList<>(courses);

        modifiableCourses.replaceAll(str->str.toUpperCase());

        System.out.println(modifiableCourses);

        modifiableCourses.removeIf(course -> course.length()>6);

        System.out.println(modifiableCourses);
    }
}
