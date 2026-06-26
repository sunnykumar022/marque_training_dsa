
import java.util.Scanner;
public class Basic {
    // unique element in an array containing each element twice except one unique
    public static int uniqueElement(int arr[]){
            int res=0;
            for(int i=0;i<arr.length;i++){
                res=res^arr[i];
            }
            return res;
    }
    public static void main(String[]args){
        // Scanner sc =new Scanner(System.in);
        // int n=sc.nextInt();
        // int []arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();

        // }
        // System.out.println("Even number:");
        // for(int i=0;i<n;i++){
        //     if(arr[i]%2==0){

        //         System.out.println(arr[i]);
        //     }
        // }
        int nums[]={10,20,20,10,30};
        System.out.println(uniqueElement(nums));

    }

    
}
