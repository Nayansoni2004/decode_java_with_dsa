//find no. of ways to reach nth stair if 1 or 3 jumps at a time is allowed and n is user input
package _01_recursion;

import java.util.Scanner;

public class _17NthStairHomeWork {
    public static int stair(int n) {
        if(n < 3) return 1;
        if(n == 3) return 2;
        return stair(n-1) + stair(n-3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("no. of ways to reach " + n + "th stair if 1 or 3 jumps is allowed are: " + stair(n));
    }
}
/*
Enter n: 5
no. of ways to reach 5th stair if 1 or 3 jumps is allowed are: 4
 */