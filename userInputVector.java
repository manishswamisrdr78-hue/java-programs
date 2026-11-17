import java.util.*;

public class userInputVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Set Vector Size : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            v.add(name);
        }

        for (String i : v) {
            System.out.println("\n" + i);

        }
        System.out.println(v.get(3));
        System.out.println(v.capacity());
        v.add("Saleem");
        v.add("Saleem");
        v.add("Saleem");
        v.add("Saleem");
        v.add("Saleem");
        v.add("Saleem");
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.isEmpty());
    }
}
