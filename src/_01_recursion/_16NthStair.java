//find no. of ways to reach nth stair, if 1 aur 2 jumps at a time is allowed?
package _01_recursion;

import java.util.Scanner;

public class _16NthStair {
    public static int stair(int n) {
        if(n <= 2) return n;
        return stair(n-1) + stair(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("no. of ways allowed to reach " +  n + "th stair if 1 aur 2 jumps is allowed are : " + stair(n));
    }
}
/*
Enter n: 10
no. of ways allowed to reach 10th stair if 1 aur 2 jumps is allowed are : 89
 */