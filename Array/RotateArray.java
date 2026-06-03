import java.util.*;
public class RotateArray {
     static void rotateArr(int arr[], int d) {
        // rotate array by d position
        int size=arr.length;
        d=d%size;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<size;i++){
            int j=i-d;
            arr[j]=arr[i];
            
        }
        int j=0;
        for(int i=size-d;i<size;i++){
            
            arr[i]=temp[j++];
           
        }
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array : ");
        
        for (int array:arr) {
            System.out.print(array+" ");
            
        }
        System.out.println();
        System.out.println("Enter d(rotated by): ");
        int d=sc.nextInt();

        rotateArr(arr,d);
        System.out.print("Array after rotation by d: ");
        for(int array: arr){
            System.out.print(array+" ");
        }
    }
}
