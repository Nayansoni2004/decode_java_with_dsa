//print subsets of a string with unique characters
package _01_recursion;

public class _28StringSubsets {
    public static void printSubsets(int i, String s, String subsets) {
        if(i == s.length()) {
            System.out.println(subsets);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1, s, subsets); //not take
        printSubsets(i+1, s, subsets+ch); //take
    }

    public static void main(String[] args) {
        String s = "abc";
        printSubsets(0, s, "");
    }
}
/*
  <-empty set
c
b
bc
a
ac
ab
abc

Process finished with exit code 0
 */