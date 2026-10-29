class Animal {
    void eat() {
        System.out.println("Animal is eating ");
    }
}

class dog extends Animal {
    void eat() {
        System.out.println("Dog is eating ");
    }

    void eatsomething() {
        super.eat();
    }
}

public class superKeyword {

    public static void main(String[] args) {

        dog d = new dog();
        d.eatsomething();
        d.eat();
    }

}
