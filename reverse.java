import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int reverse = 0;
        for (int i= num; i>0; i/=10) {
                           int digit = i % 10;
                           reverse = reverse * 10 + digit;

        }
        System.out.println(reverse);
    }
}