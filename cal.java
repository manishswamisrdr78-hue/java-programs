import java.util.*;

public class cal{
public static void main(String[]args){

Scanner op = new Scanner(System.in);

 
System.out.print("enter first number: ");
int a = op.nextInt();
System.out.print("enter second number: ");
int b = op.nextInt();
System.out.print("Choose an operator : ");
char c = op.next().charAt(0);

switch(c){
       case '+' : System.out.print(a+b);
        break;
       case '-' :  System.out.print(a-b);
         break;
       case '*' :  System.out.print(a*b);
         break;
       case '/' :  if(b==0){
System.out.print("Cann't divide by Zero !");
                              }
else{
                       System.out.print(a/b);
}
         break;
       default : System.out.print("invalid input");
         break;
        
           }


}}