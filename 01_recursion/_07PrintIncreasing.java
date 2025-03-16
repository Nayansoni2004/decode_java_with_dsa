// print 1 to n. (using extra parameter in method).
import java.util.Scanner;

public class _07PrintIncreasing {
    public static void print(int x, int n) {
        if(x > n) //base case
            return;
        System.out.println(x); //work
        print(x+1, n); //call
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        print(1, n);
        scanner.close();
    }
}
/*
D:\github_repos\decode_java_with_dsa\01_recursion>java _07PrintIncreasing
Enter n: 7
1
2
3
4
5
6
7
 */