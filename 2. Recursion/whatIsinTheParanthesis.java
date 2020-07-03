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
