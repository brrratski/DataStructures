


import java.util.Random;

public class TwoDmatrix4rows3col {
    public static void main(String[] args) {

        Random r = new Random();
        int[][] array = new int[4][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = r.nextInt(9);
                System.out.print(array[i][j] + "\t");
            }

           System.out.println();
        }

    }
}

