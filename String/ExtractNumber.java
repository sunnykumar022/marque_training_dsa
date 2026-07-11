class ExtractNumber{
     public static void main(String[] args) {
        
        String s="167abcd810";
        int count=0;
       
        for(int i=0 ;i<s.length();i++){
            char ch=s.charAt(i);
            int num=0;
            if(ch>='0' && ch<='9'){
                num= ch-'0' ;
                int j=i+1;
                while(j<s.length() && s.charAt(j)>='0' && s.charAt(j)<='9' ){
                    num=(num*10)+(s.charAt(j)-'0');
                    j++;
                }
                i=j;
                
                
            System.out.println(num);
            }
        }
        // System.out.println(count);
    }
}