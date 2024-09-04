package Accenture.Practice;

import java.util.*;

public class RemDup {
    static int removeDuplicates(int arr[]){
        if (arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);
        int j =0;
        for(int i=1;i<arr.length;i++){
            if (arr[i]!=arr[j]) {
                j++;
                arr[j]=arr[i];
            }
        }return j+1;
       
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size:");
        int n =sc.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=removeDuplicates(arr);
        for(int i=0;i<x;i++){
            System.out.print(arr[i] +" ");
        }

        sc.close();
    }
}
