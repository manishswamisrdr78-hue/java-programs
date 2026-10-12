import java.util.*;
public class firstNatural {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter any number to printing counting till 'N' numbers  : ");
         int n = sc.nextInt();
         for(int i = 1; i<=n ; i++) {
            System.out.print(i);
            System.out.print("   ");
         }
    }
}