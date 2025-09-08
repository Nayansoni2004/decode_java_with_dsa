//print all elements of an array using recursion?
package _01_recursion;

public class _24ArrayTraversal {
    public static void print(int i, int[] arr) {
        if(i == arr.length) return; //base case
        System.out.print(arr[i] + " "); //work
        print(i+1, arr); //call
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 5, 8, 6, 2};
        print(0, arr);
    }
}
/*
4 9 5 8 6 2
Process finished with exit code 0

 */