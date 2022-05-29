


import java.util.Random;
import java.util.Scanner;

public class TwoDMatrixDynamicMeasurments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter number of rows ");
        int rows = scanner.nextInt();

        System.out.println("Now enter number of columns");
        int cols = scanner.nextInt();

        Random r = new Random();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = r.nextInt(9);
                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
