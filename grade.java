import java.util.*;

public class grade{
public static void main(String[]args){

Scanner gd = new Scanner(System.in);

double marks = gd.nextDouble();

if(marks >= 90){
              System.out.print("Grade: A");
              }
else if(marks >= 75 && marks < 90){
              System.out.print("Grade: B"); 
                                  }
else if(marks >= 60 && marks < 75){
              System.out.print("Grade: C");
                                  }
else if(marks >=33 && marks < 60){
              System.out.print("Grade: D");
                                 }
else{
              System.out.print("Fail!");
    }

}}