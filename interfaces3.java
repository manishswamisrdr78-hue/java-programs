interface NewShape {
    void draw();

}

class NewCircle1 implements NewShape {
    public void draw() {
        System.out.println("New Circle 1 is Drawn !");
    }
}


class NewCircle2 implements NewShape{
    public void draw() {
         System.out.println("New Circle 2 is Drawn !");
    }
}




public class interfaces3 {
    public static void main(String[] args) {
        NewShape nc1 = new NewCircle1();
        NewShape nc2 = new NewCircle2();
        nc1.draw();
        nc2.draw();
    }
    
}
