class student {
    String name;
    int marks;

}
public class multipleClasses {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();

        s1.name = "Aaidan";
        s1.marks = 388;

        s2.name = "Kanhaiya";
        s2.marks = 400;


        System.out.println("Name1 : " + s1.name);
        System.out.println("Marks1 : " + s1.marks);
        System.out.println("Name2 : " + s2.name);
        System.out.println("Marks2 : " + s2.marks);
    }
}
