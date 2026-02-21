package objectStream;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CourseMain {
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

//        courseList.forEach(System.out::println);

//        System.out.println(courseList.stream()
//                .allMatch(course -> course.getReviewScore() > 90));


        Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore()>95;

        System.out.println(courseList.stream().anyMatch(reviewScoreGreaterThan95Predicate));

        System.out.println("***********************************");

        Predicate<Course> reviewScoreLessThan90Predicate = new Predicate<Course>() {
            @Override
            public boolean test(Course course) {
                return course.getReviewScore()<90;
            }
        };

        System.out.println(courseList.stream().noneMatch(reviewScoreLessThan90Predicate));

        System.out.println("***********************************");

        System.out.println(courseList.stream().noneMatch(reviewScoreGreaterThan95Predicate));

        Comparator<Course> comparingByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);

        List<Course> noOfStudentSorted = courseList.stream()
                .sorted(comparingByNoOfStudents)
                .toList();

        noOfStudentSorted.forEach(System.out::println);

        // now sort in decreasing order of no of student

        System.out.println("******************************************************");

        Comparator<Course> comparingStudentDecreasing =
                Comparator.comparingInt(Course::getNoOfStudents).reversed();


        List<Course> orderGreaterToSmallByNoOfStudent =
                courseList.stream()
                        .sorted(comparingStudentDecreasing)
                        .toList();

        orderGreaterToSmallByNoOfStudent.forEach(System.out::println);


        System.out.println("******************************************");

        // sort the course in descending and review wise both

        Comparator<Course> sortDescendingNoOfStudentAndReview =
                Comparator.comparingInt(Course::getReviewScore)
                        .thenComparingInt(Course::getNoOfStudents)
                        .reversed();

        List<Course> noOfStudentAndReview = courseList.stream()
                .sorted(sortDescendingNoOfStudentAndReview)
                .toList();

        noOfStudentAndReview.forEach(System.out::println);


        System.out.println("***************************************************");

        // Now let's create employee object

        List<Employee> employees = List.of(
                new Employee(1, "Alice", 60000),
                new Employee(2, "Bob", 80000),
                new Employee(3, "Charlie", 70000),
                new Employee(4, "David", 80000),
                new Employee(5, "Eva", 50000)
        );
        
        Comparator<Employee> sortedDescending = 
                Comparator.comparingDouble(Employee::getSalary)
                .reversed();

        Double secondHighestSalary = employees.stream()
                .map(emp->emp.salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                        .orElse(0.0);

        Employee secondHighest = employees.stream()
                        .filter(employee -> employee.getSalary()==secondHighestSalary)
                                .findFirst()
                                        .orElse(null);

        System.out.println("Employee with second highest salary is :"+secondHighest);

        System.out.println("Second Highest Salary of an Employee is "+secondHighestSalary);

        System.out.println("***********************************************");
        System.out.println("First five course details :");

        List<Course> firstFive = courseList.stream()
                .sorted(Comparator.comparing(Course::getName))
                .limit(5)
                .toList();

        firstFive.forEach(System.out::println);


        System.out.println("***********************************************");
        System.out.println("After skipping first five course details :");

        List<Course> skipFirstFive = courseList.stream()
                .sorted(Comparator.comparing(Course::getName))
                .skip(5)
                .toList();

        skipFirstFive.forEach(System.out::println);

        System.out.println("**********************************************************");

        courseList.forEach(System.out::println);


        // let's take all the element until reviewScore is above 95

        List<Course> takeWhileReviewGreaterThank95 = courseList.stream()
                .takeWhile(course -> course.getReviewScore()>=95)
                .toList();

        System.out.println("take while :");
        takeWhileReviewGreaterThank95.forEach(System.out::println);


        System.out.println("Drop while :");

        List<Course> dropWhileReviewScoreGreaterThan95 = courseList.stream()
                .dropWhile(course -> course.getReviewScore()>=95)
                .toList();

        dropWhileReviewScoreGreaterThan95.forEach(System.out::println);
    }
}
