import java.util.*;
public class Solution {
    /* Fill the main function to print resultant of addition of matrices*/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] matrix2 = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        print(matrix1, matrix2);
    }
    static void print(final int[][] matrix1, int[][] matrix2) {
        int x = matrix1.length, y = matrix1[0].length;
        int u = matrix2.length, v = matrix2[0].length;
        if (x == u & y == v) {
            for (int i = 0; i < matrix1.length; i++) {
                String s = "";
                for (int j = 0; j < matrix1[0].length; j++) {
                    s += matrix1[i][j] + matrix2[i][j] + " ";
                } System.out.println(s.trim());
            }
        } else {
                System.out.println("not possible");
            }
    }
}