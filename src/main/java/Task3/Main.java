package Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

        users.stream()

                .sorted(Comparator.comparing(User::getName))
                .filter((n) -> n.getAge() < 40)
                .limit(3)
                .map(User::getName)
                .forEach(System.out::println);

//        users.stream()
//                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
//                .limit(3)
//                .forEach(System.out::println);


    }
}

















