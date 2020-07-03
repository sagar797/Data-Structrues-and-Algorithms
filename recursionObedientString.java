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
