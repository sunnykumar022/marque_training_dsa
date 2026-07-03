

public class BubbleSort {

    //Swap adjacent element of an array
    public static void swap(int arr[],int j){
       int temp=arr[j];

       arr[j]=arr[j+1];
       arr[j+1]=temp;
    }

    //BubbleSort
    public static void sortingBubble(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //compare adjacent element and swap
                    swap(arr, j);//pass by refercence 
                    flag=true;
                }
                
            }
            if(!flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={9,10,4,6,3};//input element 
        sortingBubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");//output: Sorted Array
        }
        System.out.println();
    }
}


/*
    arr=[10,9,8,3,4,5]
    Pass1(n-1  ->iteration)
    9,10,8,3,4,5
    9,8,10,3,4,5 
    9,8,3,10,4,5
    9,8,3,4,10,5
    9,8,3,4,5,10

    Pass2(n-2  ->iteration)
    8,9,3,4,5,10
    8,3,9,4,5,10
    8,3,4,9,5,10
    8,3,4,5,9,10

    pass3(n-3 -->Iteration)
    3,8,4,5,9,10
    3,4,8,5,9,10
    3,4,5,8,9,10
    

    pass4(n-4)
    3,4,5,8,9,10
    pass5(n-5);

    Hence, the number of comparisons is

(n-1) + (n-2) + (n-3) +.....+ 1 = n(n-1)/2

*/
