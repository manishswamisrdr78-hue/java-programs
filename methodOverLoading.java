public class methodOverLoading {


    static int square(int a ) {
        return a*a;
    }

    static double square (double a) {
        return a*a;
    }
    public static void main(String[] args) {
        methodOverLoading a = new methodOverLoading();
        System.out.println(a.square(5));
        System.out.println(a.square(5.5));
    }
}
