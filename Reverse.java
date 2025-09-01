import java.util.ArrayList;
import java.util.Arrays;
public class Reverse {
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arr) {
        if (arr == null) {
            throw new IllegalArgumentException("ArrayList cannot be null");
        }
        int left = 0;
        int right = arr.size() - 1;
        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + numbers);
        System.out.println("Reversed ArrayList: " + reverseArrayList(numbers));
    }

}