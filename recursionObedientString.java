//Problem:

// Take as input str, a string. Write a recursive function that checks if the string was generated using the following rules and returns a Boolean value: a. the string begins with an 'a' b. each 'a' is followed by nothing or an 'a' or "bb" c. each "bb" is followed by nothing or an 'a' Print the value returned.

// Input Format
// Enter the String

// Constraints
// None

// Output Format
// Display the boolean result

// Sample Input
// abba
// Sample Output
// true

//Solution:

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
		if(str.length()<2){
			System.out.println("false");
			return;
		}
		System.out.println(isStringRO(str));
    }
	public static boolean isStringRO(String str){
		if(str.length()==0){
			return true;
		}
		char ch=str.charAt(0);
		if(ch=='a'){
			return isStringRO(str.substring(1));
		}else if(ch=='b'){
			if(str.length()>=2){
				if(str.charAt(1)=='b'){
					return isStringRO(str.substring(2));
				}else{
					return false;
				}
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}
