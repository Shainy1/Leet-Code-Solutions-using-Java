import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class secondLargest {
    public static int findSecondLargest(ArrayList<Integer> arr) {
        if (arr == null || arr.size() < 2) {
            throw new IllegalArgumentException("ArrayList must contain at least two elements");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        return secondLargest;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + numbers);
        System.out.println("Second largest element: " + findSecondLargest(numbers));

        input.close();
    }
}