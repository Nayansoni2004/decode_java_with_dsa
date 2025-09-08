//print all character(array)values of String object using recursion?
package _01_recursion;

public class _25StringTraversal {
    public static void print(int i, String s) {
        if(i == s.length()) return; //base case
        System.out.print(s.charAt(i)); //work
        print(i+1, s); //call
    }

    public static void main(String[] args) {
        String s = "Raghav Garg";
        print(0, s);
    }
}
/*
OUTPUT
Raghav Garg
Process finished with exit code 0
 */