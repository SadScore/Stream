package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i < 200; i++) {
            numbers.add((int) (Math.random() * 100 + 100));
        }
        List<String> lis = numbers.stream()
                .filter((n) -> n % 5 == 0)
                .map(Math::sqrt)
                .map(Task2::mapToString)
                .collect(Collectors.toList());
        for (String a : lis) {
            System.out.println(a);
        }


    }
    private static String mapToString(double a){
        return "Корень: " + a;
    }
}
