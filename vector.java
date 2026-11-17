import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();

        v.add(10);
        v.add(20);
        v.add(25);
        v.add(30);
        v.add(40);
        v.add(50);
        System.out.println(v);

        System.out.println(v.size());

        v.remove(2);
        System.out.println(v);
        System.out.println(v.size());
    }

}
