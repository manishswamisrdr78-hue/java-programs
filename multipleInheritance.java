class Animal {
    void eat() {System.out.println("Eating");}
}

class dog extends Animal {
    void bark() {System.out.println("Barking");}
}

class babydog extends dog {
    void weep() {System.out.println("Weeping");}
}

public class multipleInheritance {
    public static void main(String[] args) {
        babydog by = new babydog();
        by.eat();
        by.bark();
        by.weep();
        
    }
    
}
