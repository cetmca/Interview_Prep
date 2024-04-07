import java.util.Arrays;
import java.util.List;

public class EvenNumbersCount {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter out the even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .toList();

        // Count the number of even numbers
        long countEvenNumbers = evenNumbers.size();

        // Print the even numbers and the count
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Count of Even Numbers: " + countEvenNumbers);
    }
}
