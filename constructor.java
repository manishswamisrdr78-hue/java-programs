public class constructor {
    
    
    String name;
    int marks;
    
    public static void main(String[] args) {


        constructor s1 = new constructor();
        constructor s2 = new constructor();


        s1.name = "Manish";
        s1.marks = 404;

        s2.name = "Satish";
        s2.marks = 389;

        System.out.println("Name1 : " + s1.name);
        System.out.println("Marks1 : " + s1.marks);
        System.out.println("Name 2: " + s2.name);
        System.out.println("Marks2 : " + s2.marks);

    }
}
