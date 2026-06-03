import java.util.Scanner;
public class LinearSearch{
    public static boolean isFoundTrue(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static int foundAt(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size :");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter target element:");
        int target=sc.nextInt();
        System.out.println(isFoundTrue(arr,  target));
        System.out.println(foundAt(arr, target));

    }
}