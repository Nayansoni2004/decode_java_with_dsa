// print sum from 1 to n (parameterised).

import java.util.Scanner;

public class _10SumParameterised {
    public static void sum(int n, int s) {
        if(n == 0) { //base case
            System.out.println(s); //work
            return;
        }
        sum(n-1, s+n); //call
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        sum(n, 0);
        scanner.close();
    }
}
/*
D:\github_repos\decode_java_with_dsa\01_recursion>java _10SumParameterised
Enter n: 5
15

D:\github_repos\decode_java_with_dsa\01_recursion>java _10SumParameterised
Enter n: 100
5050
 */