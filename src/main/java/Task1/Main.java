package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Director director = new Director();
//        Worker worker = (n) ->{
//            for (int i = 0; i < n; i++){
//                System.out.println("Working...");
//            }
//            return "Success";
//        };
//        String result = director.forceToWork(worker, 6);
//        System.out.println(result);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        List<Integer> filtered = filter(numbers, (a) ->  a > 0);
        List<String> mapped = map(filtered);

        for (String i : mapped) {
            System.out.println(i);
        }
    }
    private static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number : numbers) {
            result.add("Number " + number);
        }
        return result;
    }

    private static List<Integer> filter(List<Integer> list, MyPredicate myPredicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (myPredicate.test(i)){
                result.add(i);
            }
        }
        return result;
    }
}
