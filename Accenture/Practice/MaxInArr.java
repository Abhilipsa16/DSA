package Accenture.Practice;

import java.util.Scanner;

public class MaxInArr {
    public static int maximum(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }return max;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter size of array:");
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println(maximum(arr));
      sc.close();  
    }
}
