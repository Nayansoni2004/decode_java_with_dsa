public class _03FunctionCall {
    public static void mango() {
        System.out.println("Hi, i am in mango");
    }
    public static void banana() {
        mango();
        System.out.println("Hi, i am in banana");
    }
    public static void apple() {
        banana();
        System.out.println("Hi, i am in apple");
        mango();
    }
    public static void main(String[] args) {
        System.out.println("Hi, i am in main");
        apple();        
    }
}
/*
D:\decode_java_with_dsa\06_recursion> java _03FunctionCall
Hi, i am in main
Hi, i am in mango
Hi, i am in banana
Hi, i am in apple
Hi, i am in mango
 */