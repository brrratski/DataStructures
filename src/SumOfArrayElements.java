


import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayElements {

    public static void main(String[] args) {
        System.out.println("Enter  size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.println("Enter the elements of the array  ");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Elements of the array are: " + Arrays.toString(arr));
        System.out.println("Sum of the elements of the array is " + sum);
    }
}
