package Accenture.Practice;

import java.util.Scanner;

public class MisNum {
    static int missingNum(int arr[],int n){
        int freq[]=new int[n+1];
        for(int i=0;i<n-1;i++){
            freq[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if (freq[i]==0) {
                return i;
            }
        }return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(missingNum(arr, n));

        sc.close();
    }
}
