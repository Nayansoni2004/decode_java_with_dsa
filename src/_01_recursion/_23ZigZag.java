//print Zig-Zag : (Already solved using pip)
//constraint: input n
//output: for n =4   -> 43211121112321112111234321121112321112111234
package _01_recursion;

import java.util.Scanner;

public class _23ZigZag {
    public static void pip(int n) {
        if(n == 0) return;
        System.out.print(n + " "); //pre
        pip(n-1); //call
        System.out.print(n + " "); //in
        pip(n-1); //call
        System.out.print(n + " "); //post
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        pip(n);
    }
}
/*
OUTPUT
Enter n: 3
3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
 */