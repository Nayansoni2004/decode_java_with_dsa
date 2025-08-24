// print 1 to n. (using global variable)
package _01_recursion;
import java.util.Scanner;

public class _06PrintIncreasing {
    static int n;
    public static void print(int x) {
        if(x > n)  //base case
            return; 
        System.out.println(x); //work
        print(x+1); //call
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = scanner.nextInt();
        print(1);
        scanner.close();
    }
}
/*
D:\github_repos\decode_java_with_dsa\01_recursion>java _06PrintIncreasing
Enter n: 10
1
2
3
4
5
6
7
8
9
10
 */