import java.util.*;
class student {
    String name;
    int marks;

}
public class multipleClasses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        student s2 = new student();
        System.out.println("Enter First Student Name & Marks : ");
        String a = sc.next();
        int b = sc.nextInt();

        s1.name = a;
        s1.marks = b;


        System.out.println("Enter Second Student Name & Marks : ");
        String c = sc.next();
        int d = sc.nextInt();

        s2.name = c;
        s2.marks = d;


        System.out.println("Name1 : " + s1.name);
        System.out.println("Marks1 : " + s1.marks);
        System.out.println("Name2 : " + s2.name);
        System.out.println("Marks2 : " + s2.marks);
    }
}
