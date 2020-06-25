
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        System.out.println(maxSubarraySumCircular(a));
    }

     private static  int kadanes(int[] a){
        int sum = a[0], answer = a[0];
        for(int i=1; i<a.length; i++){
            sum += a[i];
            if(sum < a[i]) sum = a[i];
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public static int maxSubarraySumCircular(int[] a) {
        if(a.length == 0){
            return 0;
        } 
        int x = kadanes(a);
        int y = 0;
        for(int i=0; i<a.length;i++){
            y += a[i];
            a[i] *= -1;
        }
        int z = kadanes(a);
        if(y+z == 0) {
            return x;
        }
        return  Math.max(x, y+z);
    }
}