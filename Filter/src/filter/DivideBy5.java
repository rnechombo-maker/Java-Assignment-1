package filter;
import java.util.Arrays;
import java.util.List;

public class DivideBy5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 5, 20, 30, 6);

        System.out.println("Numbers divisible by 5:");
        numbers.stream()
               .filter(n -> n % 5 == 0)
               .forEach(n -> System.out.println(n));
    }
}
