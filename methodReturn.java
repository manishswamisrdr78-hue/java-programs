import java.util.*;
public class methodReturn {
    
    static int table(int a, int i) {
        
    return a*i;
}
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to generate Table : ");
        int a = sc.nextInt();
        for (int i = 1; i<= 10; i++){
        int c = table(a,i);
        System.out.println(c);
    }
        
    }
}
