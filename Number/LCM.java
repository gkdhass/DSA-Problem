import java.util.Scanner;

public class LCM {

    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = arr[0];

        for(int i = 1; i < n; i++) {
            result = lcm(result, arr[i]);
        }

        System.out.print(result);
    }
}