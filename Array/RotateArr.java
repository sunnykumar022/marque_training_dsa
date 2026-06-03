public class RotateArr {
    public static void swap(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static int[] rotateArr(int arr[],int d){
        
        d%=arr.length;
        swap(arr, 0, d-1);
        swap(arr,d,arr.length-1);
        swap(arr, 0, arr.length-1);
        return arr;
    }

    public static void main(String args[]){
        int arr[]={1, 2, 3, 4, 5};
        int d=2;
        rotateArr(arr, d);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
