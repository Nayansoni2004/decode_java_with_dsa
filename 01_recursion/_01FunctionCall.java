public class _01FunctionCall {
    public static void apple() {
        System.out.println("Hii, i am in apple");
    }
    public static void main(String[] args) {
        System.out.println("Hii, i am in main method");
        apple();
    }
}

/*
D:\decode_java_with_dsa\06_recursion> javac _01FunctionCall.java
D:\decode_java_with_dsa\06_recursion> java _01FunctionCall
Hi, i am in main method
Hi, i am in apple
 */