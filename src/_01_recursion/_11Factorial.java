// problem for factorial zero is solved! bec. fact. of zero is one.
package _01_recursion;
import java.util.Scanner;

public class _11Factorial {
    public static void fact(int n, int result) {
        if(n==1 || n==0) { //base case
            System.out.println(result); //work
            return;
        } else { 
            fact(n-1, result * n); //recursive call
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        fact(n, 1); //second parameter is 1 bec. fact of 0 & 1 is equal 1.
        scanner.close();
    }
}
/*
D:\github_repos\decode_java_with_dsa\01_recursion>java _11Factorial
Enter n: 0
1

D:\github_repos\decode_java_with_dsa\01_recursion>java _11Factorial
Enter n: 1
1
 */