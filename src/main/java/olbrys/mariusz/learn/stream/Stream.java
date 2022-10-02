package olbrys.mariusz.learn.stream;

import java.util.List;

public class Stream {

    public static void main(String[] args) {
        printEven();
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printEven() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
