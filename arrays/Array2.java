import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int max = arr[0];

        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Largest = " + max);

        sc.close();
    }
}