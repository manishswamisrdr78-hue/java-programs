// Nested Try.
public class ExceptionHandling3 {
    public static void main(String[] args) {
        try{
            int a =2 , b =4 , c =2 , x =7 , z;
            int p[] = {2};
            p[3] = 33;
            try {
                z =  x/((b*b)-(4*a*c));
                System.out.println("The Value Of Z is : "+ z);
            }
            catch(ArithmeticException e) {
                System.out.println("Division By ZERO In Arithmetic Expression.");
                
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Is Out-Of-Bounds.");
        }
    }
}
