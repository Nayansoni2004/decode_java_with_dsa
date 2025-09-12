//print subsets of a string with unique characters and must return the powerset(set of all subsets)?
package _01_recursion;

import java.util.ArrayList;

public class _29StringSubsets {
    static ArrayList<String> arr = new ArrayList<>(); //global

    public static void printSubsets(int i, String s, String ans) {
        if(i == s.length()) { //base case
            arr.add(ans);
            return;
        }
        printSubsets(i+1, s, ans); //not take
        ans += s.charAt(i);
        printSubsets(i+1, s, ans); //take
    }

    public static void main(String[] args) {
        String s = "abcd";
        arr = new ArrayList<>(); //reset
        printSubsets(0, s, "");
        System.out.println(arr);
    }
}
/*
[, d, c, cd, b, bd, bc, bcd, a, ad, ac, acd, ab, abd, abc, abcd]
 */