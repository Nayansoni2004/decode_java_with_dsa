package _01_recursion;

import java.util.Scanner;

public class _20mazePathUsingTwoVar {
    public static int maze2(int m, int n) {
        if(m == 1 || n == 1) return 1; //base case
        int rightWays = maze2(m, n-1);
        int downWays = maze2(m-1, n );
        return rightWays + downWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m rows: ");
        int m = sc.nextInt();
        System.out.print("Enter n columns: ");
        int n = sc.nextInt();

        System.out.println(maze2(m, n));
    }
}
/*
Enter m rows: 3
Enter n columns: 3
6

 */