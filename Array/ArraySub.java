import java.util.*;

public class ArraySub {
     public static int[] arrayDiff(int a[],int b[]){
        int x=a.length;
        int y=b.length;
        int k=Math.max(x, y);
        int borrow=0;
        boolean flag=false;
        for(int i=k-1;i>=0;i--){
            
            if(!flag){

            }
        }
     }
    public static int[] calDiff(int a[], int b[], int n, int m) {
    //this methods work but if the number is neg it give extra zero instead of neg sign
      int num1=0;
      int place1=1;
      for(int i=a.length-1;i>=0;i--){
          num1+=a[i]*place1;
          place1*=10;
          
      }
      int num2=0;
      int place2=1;
      for(int i=b.length-1;i>=0;i--){
          num2+=b[i]*place2;
          place2*=10;
      }
      int res=num1-num2;
      boolean neg=false;
      if(res<0){
        res=-res;
        neg=true;
    }
    
      int res2=res;
      int count=0;
      if(neg==true){
        count=1;
      }
      while(res>0){
          count++;
          res/=10;
      }
      int []finalres=new int[count];
      for(int i=count-1;i>=0;i--){
          finalres[i]=res2%10;
          res2/=10;
      }
     
      return finalres;
  }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of num1[]:");
    int n1 = sc.nextInt();

    int[] arr1 = new int[n1];
    System.out.println("Enter n elments:");

    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();
    System.out.println("Enter size of num2");
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    System.out.println("Enter m elements");

    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    

    int[] res = calDiff(arr1, arr2, n1, n2);
    for (int i : res) System.out.print(i);
  }
}
