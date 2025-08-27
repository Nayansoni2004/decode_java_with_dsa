//write a function to calculate the nth fibonacci number using recursion, n is user input.
package _01_recursion;

import java.util.Scanner;

public class _15FibonacciNumber {
    public static int fibo(int n) {
    if(n <= 1) return n; //base case
    return fibo(n - 1) + fibo(n - 2); //call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Number of " + n + " is " + fibo(n));
    }
}
/*
Enter n: 20
Fibonacci Number of 20 is 6765
 */