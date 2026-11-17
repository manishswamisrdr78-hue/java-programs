import java.util.*;
public class userInputMultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int s = sc.nextInt();
        String [][][] arr = new String[s][s][s];

System.out.println("give input : ");
            for(int i=0; i<s; i++){
                for(int j=0; j<s; j++){
                    for(int k=0; k<s; k++){
                        arr[i][j][k] = sc.nextLine();
                
            }
                
            }
            }
System.out.println("Print input : ");
        for(int i=0; i<s; i++){
                 for(int j=0; j<s; j++){
                     for(int k=0; k<s; k++){
                        System.out.print(arr[i][j][k]);
                         System.out.print("    ");
        }
       
                            System.out.print("\n");
        }
        
        }

        
    }
}
