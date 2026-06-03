
import java.util.Scanner;
public class DecimalToOctal {
    public static int decimalToOctal(int n){
        int res=0;
        int placeValue=1;
        while(n>0){
            int digit=n%8;
            res+=digit*placeValue;
            placeValue*=10;
            n/=8;
        }
        return res;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int n=sc.nextInt();
        int octal=decimalToOctal(n);
        System.out.println("Octal representation: " + octal);
    }
}
