//Throwing MY Own Exception.

import java.lang.Exception;
class MyException extends Exception {
    MyException(String message){
        super(message);
    }
}



public class ExceptionHandling5 {
    public static void main(String[] args) {
        int x= 5;
        int y= 1000;
        try {
            float z = (float) x / (float) y;
            if (z < 0.01){
                throw new MyException("Number Is Too Small.");
            }
        }
        catch (MyException e) {
            System.out.println("Caught My Exception.");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I am always Here.");
        }

        
    }
}
