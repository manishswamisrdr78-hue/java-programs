import java.util.Scanner;
public class prime1 {
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.print("Kahan tak prime number dekhne hai : ");
int a = sc.nextInt();
int n = a;

    
for(int num=2; num<=n; num++  ){
    
int count = 0;
    
for (int i =1; i<= num; i++){

if(num%i==0){
    
count++;

}
    
}
    if(count==2){
        
System.out.println(num+ "");
}
}  



}}