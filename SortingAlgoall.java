import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {
            7,
            2,
            6,
            1,
            0
        };
        
        //Bubble Sort No. of Operations+Sorting 
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // System.out.println(bubbleSort(arr));

        //Selection Sort
        // selectionSort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        
        //Insertion Sort
        // insertionSort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        
        //Merge Sort
        // mergeSort(arr,0,arr.length-1);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
    }
    public static int bubbleSort(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    count++;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return count;
    }
    //min selection and replace smaller with larger from 0 to arr.length-1
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                //looking for largest value
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    //max selection and replace larger with smaller from 0 to arr.length-1
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[max]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[max];
                    arr[max] = temp;
                }
            }
        }
    }
    //Merge by using Divide And Conquer Algorithm to Combine at last
    public static void mergeSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        mergeKrkeLao(arr,start,mid,end);
    }
    public static void mergeKrkeLao(int[] arr,int st,int mid,int ed){
        int temp[]=new int[ed-st+1];
        int i=st,j=mid+1,k=0;
        while(i<=mid&&j<=ed){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
                
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ed){
            temp[k++]=arr[j++];
        }
        
        // for(int v=0;v<temp.length;v++){
        //     arr[v]=temp[v];
        // }
        for(int v=st;v<=ed;v++){
            arr[v]=temp[v-st];
        }
    }
}