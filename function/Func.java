class Func{
        public static int binaryToDecimal(int n){
        int res=0;
        int place=1;
        while(n>0){
            int digit=n%10;
            res=res+digit*place;
            place*=2;
            n/=10;
        }
        return res;
    } 
    public static long decimaltoBinary(int n){
        long binaryNum=0;
        int place=1;
        while(n>0){
            int digit = n%2;
            n/=2;
            binaryNum+=digit*place;
            place*=10;
        }
        return binaryNum;
    }
    public static int removeZerosWithFive(int n){
        // int newNum=0;
        // while(n>0){
        //     int digit =n%10;
        //     if(digit==0){
        //         digit=5;
        //     }
        //     newNum=newNum*10+digit;
        //     n/=10;
        // }
        // return newNum; this will give the number in reverse order
        int newNum=0;
        int placeValue=1;
        while(n>0){
            int digit =n%10;
            if(digit==0){
                digit=5;
            }
            newNum+=digit*placeValue;
            placeValue*=10;
            n/=10;
        }
        return newNum;
    }
    public static boolean secondLastIsEven(int n){
        n/=10;
        int digit = n%10;
        return digit%2==0;
    }
    public static String Greet(String name){
        return "Namaste" + name;
    }

    public static int countDigits(int n){
        int count =0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    public static int addbw(int a, int b){
        int sum=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int nCr(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static int nPr(int n, int r){
        return factorial(n)/factorial(n-r);
    }
    public static void main(String[] args){
        int a=1;
        int b=10;
        System.out.println(addbw(a,b));
        System.out.println(nCr(5, 2));
        System.out.println(nPr(5, 2));
        System.out.println(countDigits(12345));
        System.out.println(secondLastIsEven(12345));
        System.out.println(removeZerosWithFive(102030));
        System.out.println(decimaltoBinary(50));
        System.out.println(binaryToDecimal(110010));
            
    }
}