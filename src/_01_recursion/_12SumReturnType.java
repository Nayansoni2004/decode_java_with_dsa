// print sum of (1 to n) or of (n to 1) using (Return type).
package _01_recursion;
import java.util.Scanner;

public class _12SumReturnType {
    public static int sum(int n) {
        if(n == 1 || n == 0) //base case
            return n; 
        return n + sum(n-1); //call
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println(sum(n)); //work
        scanner.close();
    }
}
/*
Key Takeaways:
✅ The recursive call keeps reducing n until it reaches 1.
✅ Once the base case is hit, the recursion starts returning values.
✅ The + operator ensures the sum is accumulated on the way back.
 */
/* output:
D:\github_repos\decode_java_with_dsa\01_recursion>java _12SumReturnType
Enter n: 5
15

D:\github_repos\decode_java_with_dsa\01_recursion>java _12SumReturnType
Enter n: 45
1035
 */