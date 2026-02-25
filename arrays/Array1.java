import java.util.*;
public class Array1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of elements");
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i<n; i++){
	arr[i] = sc.nextInt();
	}
	System.out.println("The array elements : ");
	for(int val : arr){
 	System.out.println(val);}
        

            }
}