import java.util.*;

public class factMethod {
static Scanner sc = new Scanner(System.in);
static int fact ;
static int total = 1;
static {
    System.out.println("Enter a number to find Factorial : ");
    fact = sc.nextInt();
}

static void findfact () {
for (int i=1; i<=fact; i++){
    total = total * i;
}
System.out.println(total);

    
}

public static void main(String[] args) {
    findfact();
}
}