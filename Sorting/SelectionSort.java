class SelectionSort{
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min_index=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={9,10,4,6,3};//input element 
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");//output: Sorted Array
        }
        System.out.println();
    }
}