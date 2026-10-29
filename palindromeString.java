import java.util.*;
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        
        String reverse = "" ;

        for (int i = n.length() - 1; i >= 0; i--) {
            reverse = reverse + n.charAt(i);
        }

        if (n.equalsIgnoreCase(reverse) ) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

    }
    
}
