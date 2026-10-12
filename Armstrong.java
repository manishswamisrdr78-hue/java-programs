import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;

        for (int i=n; i>0; i/=10){
            int digit = i % 10;
            sum = sum + digit*digit*digit;
             
        }
        if (original == sum){
            System.out.println(n + " is an Armstrong Number. ");
        }
        else{
            System.out.println(n + " isn't an Armstrong Number. ");
        }
    }
    
}
