import java.util.*;

public class checkEvenOddMethod {

    static Scanner sc = new Scanner(System.in);
    static int a;

    static {
        System.out.println("Enter a number to check whether it is Even or Odd:");
        a = sc.nextInt();
    }

    static void check() {
        if (a % 2 == 0) {
            System.out.println("It is an Even Number!");
        } else {
            System.out.println("It is an Odd Number!");
        }
    }

    public static void main(String[] args) {
        check();
    }
}