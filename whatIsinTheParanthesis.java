//Problem:

// Take as input str, a string. The string contains a single pair of parenthesis “(..)”. Write a recursive function which returns the contents between the parenthesis. E.g. for “xyz(abc)def” return “abc”. Print the value returned.

// Input Format
// Enter the string

// Constraints
// None

// Output Format
// Display the content between the parenthesis

// Sample Input
// abc(x)
// Sample Output
// x

//Solution:

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		getContentBetweenP(str,"");
    }
	public static void getContentBetweenP(String str,String asf){
		if(str.length()==0){
			return;
		}
		char ch=str.charAt(0);
		if(ch=='('){
			while(ch!=')'){
				str=str.substring(1);
				ch=str.charAt(0);
				if(ch!=')'){
					asf+=ch;
				}
			}
			System.out.println(asf);
			return;
		}else{
			getContentBetweenP(str.substring(1),asf);
		}
	}
}
