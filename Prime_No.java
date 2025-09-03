import java.util.Scanner;

class PrimeNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        else if (n == 2 || n == 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        } else {
            int x = 5;
            while (x * x <= n) {
                if (n % x == 0 || n % (x + 2) == 0) {
                    return false;
                }
                x += 6;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPrime(num));
        input.close();
    }
}
