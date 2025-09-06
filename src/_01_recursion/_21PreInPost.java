package _01_recursion;

public class _21PreInPost {
    public static void pip(int n) {
        if(n == 0) return;
        System.out.println(n); //pre
        pip(n-1); //call
        System.out.println(n); //in
        pip(n-1); //call
        System.out.println(n); //post
    }

    public static void main(String[] args) {
        pip(3);
    }
}
/* OUTPUT
3 <-
2
1
1
1
2
1
1
1
2
3 <-
2
1
1
1
2
1
1
1
2
3 <-
 */