public class CountWord {
    public static void main(String []args){
        String str="Cat dog Meow";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(((str.charAt(i)+ 0 )>64 && (str.charAt(i)+ 0 )<91) || ((str.charAt(i)+ 0 ) >96 && (str.charAt(i)+ 0 ) <123)){
                count++;
            }
        }
        System.out.println(count);
    }
}
