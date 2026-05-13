import java.util.*;
public class Second_larg_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if(arr[i] > large){
                second_large = large;
                large =arr[i];
            }
            else if(arr[i] > second_large && arr[i] != large){
                second_large = arr[i];
            }
        }
        System.out.println("The Second Largest Element is "+ second_large);
    }
}
