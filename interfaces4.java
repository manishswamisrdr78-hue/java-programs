interface NewShap{
    
    void draw();
}

class NewCircle implements NewShap {
int Radius = 10;

    public void draw() {
        Radius = 1 ;
        System.out.println("Radius is : " +Radius);
    }
}



public class interfaces4 {
    public static void main(String[] args) {
        NewShap nc = new NewCircle();
        nc.draw();
    }
    
}
