public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        
        int l=0;
        int r=s.length()-1;
        while(r>l){
            char left=s.charAt(l);
            char right=s.charAt(r);
            if(l!=r){
                return false;
            }
            l++;
            r--;
        }
        return false;
    }
    public static void main(String args[]){
        String s="12321";
        System.out.println(isPalindrome(s));
    }
}
