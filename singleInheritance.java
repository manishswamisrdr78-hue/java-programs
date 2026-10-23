class grandfather {
    String name1 = "Moolchand";
}

class father extends grandfather {
    String name2 = "Foolchand";
}


public class singleInheritance   {

    public static void main(String[] args) {
        father n = new father();
        System.out.println("Grandfather name is : " + n.name1);
        System.out.println("Father name is : " + n.name2);
    }
    
}
