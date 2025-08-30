public class Main{

    public static int findGreates(int[] arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Greatest element: " + findGreates(numbers));
    }

}