
public class funtion {
    String name;
    int age;
    int marks;

    funtion(String s ,int a , int b) {
        name = s;
        age = a;
        marks = b;

    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks + "\n");
    }

    public static void main(String[] args) {

        funtion a = new funtion("Manish",22,404);
        funtion b = new funtion("Rehaan",18,389);
        a.display();
        b.display();
        
        


    }
}
