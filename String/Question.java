/*
Input
1010100
0100101
Output
1110001
*/
/**
 * Question
 */
import java.util.*;
public class Question {

   public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		String s1=sc.next();
		System.out.println("Enter 2nd no: ");
		String s2=sc.next();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s1.length();i++){
			int a=(s1.charAt(i)-'0') ^ (s2.charAt(i)-'0');
			sb.append(a);
		}
		System.out.println(sb);
		
	}

}