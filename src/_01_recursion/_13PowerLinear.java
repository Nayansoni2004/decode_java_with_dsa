package _01_recursion;

import java.util.Scanner;

public class _13PowerLinear {
    public static int pow(int a, int b) {
        if(b == 0)
            return 1; //because power 0 of any no. is 1.
        return a * pow(a, b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();

        System.out.println(a + " raised to power " + b + " is " + pow(a, b));
    }
}
/* OUTPUT
Enter base: 9
Enter power: 3
9 raised to power 3 is 729

Process finished with exit code 0
*/