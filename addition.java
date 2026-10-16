import java.util.*;
public class addition {
    
    int a;
    int b;
    int d;

    addition(int a, int b) {
        System.out.println(a+b);
    }
    addition(int e , int c, int d)
    {
        System.out.println(e+c+d);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("Adding 2 digits ");
        addition add2 = new addition(a,b);

         System.out.println("Adding 3 digits ");
         addition add3 = new addition(e,c,d);
       // System.out.println(a.addition); 
    }

}
