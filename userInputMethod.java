import java.util.*;

public class userInputMethod {

    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;

    static {
        System.out.println("Enter first Number : ");
        a = sc.nextInt();
        System.out.println("Enter second Number : ");
        b = sc.nextInt();
    }

    static void addition() {
        System.out.println(a + b);
    }

    static void subtraction() {
        System.out.println(a - b);
    }

    static void multiplicaton() {
        System.out.println(a * b);
    }

    static void division() {
        System.out.println((float) a / b);
    }

    public static void main(String[] args) {

        System.out.print("Addition : ");
        addition();
        System.out.print("Subtraction : ");
        subtraction();
        System.out.print("Multiplication : ");
        multiplicaton();
        System.out.print("Division : ");
        division();
    }
}
