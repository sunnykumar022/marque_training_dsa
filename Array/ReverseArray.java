import java.util.Scanner;
public class ReverseArray {
    public static void reverseArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
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
        reverseArray(arr);
        System.out.print("Reversed array: ");
        for(int array: arr){
            System.out.print(array+" ");
        }
    }
}
