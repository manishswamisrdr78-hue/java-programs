import java.util.*;
public class sumOfNatural {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter any number to printing counting till 'N' numbers and printing Sum of Total : ");
         int n = sc.nextInt();
         int sum = 0;
         for(int i = 1; i<=n ; i++) {
            
            System.out.print(i);
            System.out.print("   ");
            sum = sum+i;
         }
         System.out.print("total : " +sum);
    }
}