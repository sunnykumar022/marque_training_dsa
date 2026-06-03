public class CountlementLessthan {
    public static int countlementLessthan(int arr[],int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x) count++;
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]={2,4,5,8,4,6,6,54,98};
        System.out.println(countlementLessthan(arr,34));
    }
}
