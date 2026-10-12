import java.util.*;
public class inputReverseArray {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Array Size : ");
int n = sc.nextInt();
int[] arr = new int[n];
for (int i = 0; i<n; i++) {
    arr[i] = sc.nextInt();
}
System.out.println("Reverse Array is : ");
for(int i=arr.length-1 ; i>=0; i--) {
    
    System.out.println(arr[i] + " ");
}
    }
}
