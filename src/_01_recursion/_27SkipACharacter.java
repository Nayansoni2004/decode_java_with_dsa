//remove all occurrences of 'a' from a string
//solved using easiest way
package _01_recursion;

public class _27SkipACharacter {
    public static void skip(int i, String s, String ans) {
        if(i == s.length()) {
            System.out.println(ans);
            return;
        }
        if(s.charAt(i) != 'a') skip(i+1, s, ans = ans + s.charAt(i));
        else skip(i+1, s, ans);
    }

    public static void main(String[] args) {
        String s = "Nayan Malviya";
        skip(0, s, "");
    }
}
/*
Nyn Mlviy

Process finished with exit code 0

 */