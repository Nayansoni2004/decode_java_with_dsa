// print n to 1. 
import java.util.Scanner;

public class _05PrintDecreasing {
    public static void print(int n) {
        if(n == 0) 
            return;
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
/*
D:\github_repos\decode_java_with_dsa\01_recursion>java _05PrintDecreasing
Enter n: 5
5
4
3
2
1
 */