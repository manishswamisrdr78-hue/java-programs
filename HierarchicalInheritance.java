class Animal {
    void eat() {System.out.println("eating");}
}

class Dog extends Animal {
    void bark() {System.out.println("Barking");}
}
class Cat extends Animal {
    void miau() {System.out.println("Miiaauuuu");}
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat n = new Cat();
        n.miau();
        n.eat();

        Dog D = new Dog();
        D.bark();
        D.eat();


        
    }
}
