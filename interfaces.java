interface FamousLine {
    void Showline();
    
}
class nove11 implements FamousLine {
    public void Showline()  {

        
        System.out.println("Book name = To be , or not to be !");
    }

}

class nove12 implements FamousLine {
    public void Showline() {
        System.out.println("Author name = Shakespeare");
    }
}
 

public class interfaces {
    public static void main(String[] args) {
        nove11 hemlet = new nove11();
        nove12 juliet = new nove12();

        hemlet.Showline();
        juliet.Showline();
    }
}
