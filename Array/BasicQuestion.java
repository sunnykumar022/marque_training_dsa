
public class BasicQuestion {
    public static int findElementAtIndex(int i, int[] arr){
        return arr[i];
    }
    public static void main(String args[]){
        int []arr={1,2,3,4,5};
        System.out.println("element at index: "+ findElementAtIndex(2,arr));
    }
}
