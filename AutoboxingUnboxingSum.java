import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutoboxingUnboxingSum {

    // Method to parse a list of strings into Integer objects
    public static List<Integer> parseStringToIntegerList(String[] numbers) {
        List<Integer> integerList = new ArrayList<>();
        for (String num : numbers) {
            integerList.add(Integer.parseInt(num)); // Autoboxing
        }
        return integerList;
    }

    // Method to calculate the sum of integers using unboxing
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing happens here
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] numberStrings = input.split("\\s+");

        // Parsing strings to Integer list
        List<Integer> numbers = parseStringToIntegerList(numberStrings);

        // Calculating sum
        int sum = calculateSum(numbers);

        // Displaying result
        System.out.println("Sum of the entered numbers: " + sum);

        scanner.close();
    }
}
