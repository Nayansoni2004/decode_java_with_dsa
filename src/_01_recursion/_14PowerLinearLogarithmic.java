package _01_recursion;

import java.util.Scanner;

public class _14PowerLinearLogarithmic {

    public static int powLog(int a, int b) {
        if(b == 0) return 1; //bec. power 0 of any no. is 1
        int ans = powLog(a, b/2);
        if(b%2 == 0) return ans * ans; //for even case...
        else return ans * ans * a; //for odd case...
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();

        System.out.println(a + " raised to power " + b + " is " + powLog(a, b));
    }
}
/* OUTPUT
Enter base: 2
Enter power: 8
2 raised to power 8 is 256
 */