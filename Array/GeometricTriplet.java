

class GeometricTriplet {
    public static void geometricTriplet(int arr[]){
        int n=arr.length;
        for(int j=1;j<n-1;j++){
            int i=j-1;
            while(i>=0){
                int k=j+1;
                while (k<n) {
                 if(arr[j]*arr[j]==arr[i]*arr[k]){
                    System.err.print(arr[i]+" "+arr[j]+" "+arr[k]);
                }
                System.out.println();
                k++;
            }
                
                i--;
            }
            
        }
    }

    public static void main(String []args){
        // int arr[]={1,2,2,4};
        int arr[] = {1, 2, 4, 8, 16};
        geometricTriplet(arr);

    }
    
}