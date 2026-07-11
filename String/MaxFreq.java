class MaxFreq{
     public static void main(String[] args) {
        String s="aaabbccdee";
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            freq[ind]++;
        }
        int max=0;
        for(int i=0;i<26;i++){
            if(freq[i]>max){
                max=freq[i];
            }
        }
        System.out.println(max);
    }
}