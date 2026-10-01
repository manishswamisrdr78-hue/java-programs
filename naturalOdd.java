import java.util.*;
public class naturalOdd {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter any number to printing Odd counting till 'N' numbers  : ");
         int n = sc.nextInt();
         for(int i = 1; i<=n ; i++) {
            if (i%2!=0)
            {System.out.print(i);
            System.out.print("   ");}
         }
    }
}