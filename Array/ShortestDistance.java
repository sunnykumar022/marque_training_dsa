import jav  a.util.*;
public class ShortestDistance{
    // Write a program to find out the shortest distance between two even positive integers in an array arr and print the distance. If there is one or zero even positive integer in the array then return -1.
    public static int shortestDistance(int arr[]){
        
        int res=arr.length;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
               for(int j=i+1;j<arr.length;j++){
                   if(arr[j]%2==0){
                    res=Math.min(res,j-i);
                   }
               }
            }
            
        }
        return res==arr.length ? -1 : res;
    }
    public static void main(String []args){
        int arr[]={1, 4, 3, 8, 5, 10};
        System.out.println(shortestDistance(arr));
    }
}