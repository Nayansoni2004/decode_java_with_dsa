public class _02FunctionCall {
    public static void mango() {
        System.out.println("Hi, i am in mango");
    }

    public static void banana() {
        System.out.println("Hi, i am in banana");
        mango();
    }
    public static void apple() {
        System.out.println("Hi, i am in apple");
        banana();
    }
    public static void main(String[] args) {
        System.out.println("Hi, i am in main method");
        apple();
    }
}
/*
D:\decode_java_with_dsa\06_recursion> java _02FunctionCall
Hi, i am in main method
Hi, i am in apple
Hi, i am in banana
Hi, i am in mango
 */