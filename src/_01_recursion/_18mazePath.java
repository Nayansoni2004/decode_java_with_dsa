// given m * n grid you have to reach from top left corner to bottom right corner. you can go either right or down at a time. find the no. of paths.
package _01_recursion;

import java.util.Scanner;

public class _18mazePath {
    public static int maze(int row, int col, int m, int n) {
        if(row == m && col == n) return 1;
        if(row > m || col > n) return 0;
        int rightways = maze(row, col + 1, m, n);
        int downways = maze(row + 1, col, m, n);
        return rightways + downways;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter m rows: ");
        int m = sc.nextInt();
        System.out.print("Enter n columns: ");
        int n = sc.nextInt();

        System.out.println("there are " + maze(1, 1, m, n) + " possible paths to reach " + m + " * " + n + " grid");
    }
}
/*
Enter m rows: 2
Enter n columns: 3
there are 3 possible paths to reach 2 * 3 grid
 */

/*
Enter m rows: 3
Enter n columns: 3
there are 6 possible paths to reach 3 * 3 grid
 */