import java.util.*;

public class min_and_max {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);
        numbers.add(2);

        // Get minimum number
        int min = Collections.min(numbers);

        // Get maximum number
        int max = Collections.max(numbers);

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}