//make a function which calculates the factorial of n using recursion?
import java.util.Scanner;

public class _04Factorial {
    public static int fact(int n) {
        if(n == 1) 
            return 1; //if this line runs then rest of lines will not run.
        int ans = n * fact(n-1); //recursive call.
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(fact(n));

        sc.close();
    }
}
/*
D:\decode_java_with_dsa\06_recursion>java _04Factorial
Enter n: 2
2

D:\decode_java_with_dsa\06_recursion>java _04Factorial
Enter n: 5
120
 */