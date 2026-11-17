import java.util.*;
public class userInputCalculator {

    int add(int a ,int b){
        return a+b;
    }

    int sub(int a ,int b){
        return a-b;
    }

    int multi(int a ,int b){
        return a*b;
    }

    int div(int a ,int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Choose an Operator (+,-,*,/): ");
        int b = sc.nextInt();
        if (b=='+') {
            add(a,b);
            
        }


    }
}
