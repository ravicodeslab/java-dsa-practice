import java.util.*;

public class Array5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Array must have at least 3 elements");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("No third largest element found");
        } else {
            System.out.println("Third Largest Element: " + third);
        }

        sc.close();
    }
}