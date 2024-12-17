package Task4;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 36));
        users.add(new User("Max", 22));
        users.add(new User("John", 32));
        users.add(new User("Andrew", 24));
        users.add(new User("Nuke", 18));
        users.add(new User("Alice", 11));
        users.add(new User("Helen", 16));
        //Стрим массива! Через Статический метод класса Arrays
        int[] array = {1, 4, 5, 6, 5, 14, 99};
        Arrays.stream(array).filter(num -> num < 6);
        // Статический метод класса Stream

        int[] array2 = {1, 4, 5, 6, 5, 14, 99};
        Stream.of(5,7,3,7).filter(num2 -> num2 == 7);


        Optional<User> oldest = users.stream()
                .max(Comparator.comparingInt(User::getAge));
        oldest.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));

        Optional<User> firsElement = users.stream()
                .filter(user -> user.getName().contains("l")).findFirst();
        firsElement.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));

//        users.stream()
//                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
//                .limit(3)
//                .forEach(System.out::println);


    }
}

















