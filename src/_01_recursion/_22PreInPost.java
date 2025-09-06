package _01_recursion;

public class _22PreInPost {
    public static void pip(int n) {
        if(n == 0) return;
        System.out.println(n + " pre");
        pip(n-1);
        System.out.println(n + " in");
        pip(n-1);
        System.out.println(n + " post");
    }

    public static void main(String[] args) {
        pip(2);
    }
}
/*
OUTPUT
2 pre
1 pre
1 in
1 post
2 in
1 pre
1 in
1 post
2 post

 */