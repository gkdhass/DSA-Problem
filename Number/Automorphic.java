import java.util.Scanner;

public class Automorphic {

    public static boolean isAutomorphic(int n) {

        int square = n * n;
        int temp = n;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }

            temp /= 10;
            square /= 10;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (isAutomorphic(num)) {
                System.out.print(num + " ");
            }
        }
    }
}