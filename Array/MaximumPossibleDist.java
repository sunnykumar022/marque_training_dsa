import java.util.*;
public class MaximumPossibleDist {
   
//You have been given an array arr that might contain duplicate elements. Your task is to find the maximum possible distance between occurrences of two repeating elements i.e. elements having the same value. If there are no duplicate elements in the array, print 0"
public static int max(int a,int b){
    if(a>b) return a;
    return b;
}
public static int maximumPossibleDist(int arr[]){
   int  dist=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            if(arr[i]==arr[j]){
                dist= max(dist,j-i);
            }


        }
    }
    return dist;
}
public static void main(String args[]){
    int arr[]={1,2,3,4,5,3,6,3,2};
    System.out.println(maximumPossibleDist(arr));

}

}
