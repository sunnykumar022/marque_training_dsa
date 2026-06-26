import java.util.*;
public  class MissingNumbers {
    public static int[] missingNumbers(int arr[]){
        Arrays.sort(arr);
        int n=arr[arr.length-1];
        int temp[]=new int[n];
        int res[]=new int[n-arr.length+1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i) temp[i]++;
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(temp[i]==0) {
                res[j]=i;
                j++;
            }
        }
        return res;

    }
    public static void main(String[] args ){
        int arr[]={1,2,3,5,7};
        int res[]=missingNumbers(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }

    }
}
