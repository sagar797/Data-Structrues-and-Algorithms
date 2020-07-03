// Minimum Square Area

// The students of 'IERT , Allahabad' are enjoying their summer holidays around the city in Allahabad.
// If their locations are mapped on a 2D - coordinate system , can you tell the minimum area of square that can accomodate all of them?
// Note:- The edges of square will be parallel to the coordinate axes.

// Input Format

// The first line of the input contains T, denoting the number of test cases.
// Each test case consists of a single positive integer N denoting the number of students around the city.
// Each of the next N lines contains two integers xi and yi denoting the coordinates of the ith student.

// Constraints

// 1<=T<=5
// 1<=N<=10^5
// -10^9<=xi,yi<=10^9

// Output Format
// For each test-case, output a single non-negative integer denoting the minimum area of the square.
// Sample Input 0
// 2
// 4
// -1 -1
// 1 1
// 1 -1
// -1 1
// 3
// 0 0
// 1 1
// 2 2
// Sample Output 0
// 4
// 4

//Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=1;i<=t;i++){
            int n=scn.nextInt();
            int arr[][]=new int[n][2];
            for(int j=0;j<n;j++){
                for(int k=0;k<2;k++){
                    arr[j][k]=scn.nextInt();
                }
            }
            System.out.println(minArea(arr));
        }
    }
     public static long minArea(int[][] arr){
            long minR=Integer.MAX_VALUE;
            long maxR=Integer.MIN_VALUE;
            long minC=Integer.MAX_VALUE;
            long maxC=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i][0]>maxR){
                    maxR=arr[i][0];
                }
                if(arr[i][0]<minR){
                    minR=arr[i][0];
                }
                if(arr[i][1]>maxC){
                    maxC=arr[i][1];
                }
                if(arr[i][1]<minC){
                    minC=arr[i][1];
                }
            }
         long ans=Math.max(maxR-minR,maxC-minC);
            return ans*ans;
        }
}