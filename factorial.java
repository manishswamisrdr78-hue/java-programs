import java.util.*;
public class factorial {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Factorial");
        int fact = sc.nextInt();
        int total=1;
        for(int i=1; i<=fact; i++){
            total = total * i;

        }
        System.out.print(total);
    }
}
