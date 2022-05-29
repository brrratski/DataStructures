


import java.util.Random;
import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
//
        //    Random r = new Random();
//        int[][] array = new int[4][4];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < 4; j++) {
//                array[i][j] = r.nextInt(9);
//                System.out.print(array[i][j] + "\t");
//            }
//
//            System.out.println();
//
//
//        }
//        int sum = array[0][0] + array[1][1] + array[2][2] + array[3][3];
//        System.out.println("The sum of the diagonals is " + sum);

        Scanner scanner = new Scanner(System.in);

        int i, j, row, col, sum = 0;
        System.out.println("number of rows:");
        row = scanner.nextInt();
        System.out.println("number of columns:");
        col = scanner.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The elements of the matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }

        System.out.printf("the sum of diagonal elements of the matrix = " + sum);
    }
}
