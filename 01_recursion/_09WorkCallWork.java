// print decreasing then increasing (work, call, work).

import java.util.Scanner;

public class _09WorkCallWork {
    public static void print(int n) {
        if(n == 0)
            return; //base case
        System.out.println(n); //work
        print(n-1); //call
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
D:\github_repos\decode_java_with_dsa\01_recursion>java _09WorkCallWork
Enter n: 5
5
4
3
2
1
1
2
3
4
5
 */