import java.util.*;

class Array3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array size must be greater than 1");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLarges = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {
                secondLarges = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLarges && arr[i] != largest) {
                secondLarges = arr[i];
            }
        }

        if (secondLarges == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
        } else {
            System.out.println("The second largest element is: " + secondLarges);
        }

        sc.close();
    }
}