//re-arrange the steps,first call & then do work.
package _01_recursion;
import java.util.Scanner;

public class _08PrintIncreasingAfterCall {
    public static void print(int n) {
        if(n==0) //base case 
            return;
        print(n-1);// call 
        System.out.println(n); //work
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        print(n);
        scanner.close();
    }
}
/*
After returning from the recursive call, it prints n.
Since the function first goes down to 1 before printing, numbers are printed in increasing order.
How It Works (for n = 5)
Recursive Calls:
print(5) calls print(4)
print(4) calls print(3)
print(3) calls print(2)
print(2) calls print(1)
print(1) calls print(0) → Base Case reached!
Backtracking & Printing:
print(1) prints 1
print(2) prints 2
print(3) prints 3
print(4) prints 4
print(5) prints 5
 */
/* OUTPUT:
D:\github_repos\decode_java_with_dsa\01_recursion>java _08PrintIncreasingAfterCall
Enter n: 5
1
2
3
4
5
 */