package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
       printmessage("Hello, world!", 3);
       printmessage("Hello, world!", 5);
       printmessage("Hello, world!", 7);
    }
    public static void printmessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
