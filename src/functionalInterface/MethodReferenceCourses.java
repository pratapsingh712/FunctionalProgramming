package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceCourses {

    private static void print(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {

        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCS","Azure","Docker","Kubernetes");

        courses.stream()
                .map(String::toUpperCase)
                .forEach(MethodReferenceCourses::print);

//        Supplier<String> supplier = () -> new String();

        Supplier<String> supplier = () -> new String("HELLO");

        System.out.println(supplier.get());

    }
}
