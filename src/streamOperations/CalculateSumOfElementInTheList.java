package streamOperations;

import java.util.List;

public class CalculateSumOfElementInTheList {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

//        int sum = addListElementUsingStructuredWay(numbers);
//
//        System.out.println("sum of all the numbers is : "+sum);
//
//        System.out.println("***********************************");

        int sum1 = addListElementUsingFunctionalWay(numbers);

        System.out.println("Sum of all the numbers is : "+sum1);
    }

    private static int sum(int aggregate, int nextNumber){
        System.out.println(aggregate+" "+nextNumber);
        return aggregate+nextNumber;
    }

    private static int addListElementUsingFunctionalWay(List<Integer> numbers) {
        return numbers.stream()
//                .reduce(0,CalculateSumOfElementInTheList::sum);
                //.reduce(0,(aggregate,nextValue)->aggregate+nextValue);
                .reduce(0,Integer::sum);
                // stream of numbers -> one result value
                //combine then into one result => one value
                // will start with 0 and (a,b) -> a+b CalculateSumOfElementInTheList::sum
    }

    private static int addListElementUsingStructuredWay(List<Integer> numbers) {
        int sum = 0;

        for(int num : numbers){
            sum += num;
        }

        return sum;
    }
}
