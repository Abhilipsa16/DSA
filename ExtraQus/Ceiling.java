package ExtraQus;

import java.util.Scanner;

public class Ceiling {
    public static int  nextGreaterElem(int[]arr ,int target){
        int st=0 , end = arr.length-1;
        if(target>arr[arr.length-1]) return -1;
        while(st<=end)
        {
            int mid= st+(end-st)/2;
          if (target<arr[mid]) {
            end = mid-1;
           }else if(target>arr[mid]){
            st=mid+1;
           }else{ return mid;}
        }return st;
    }
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size: ");
          int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements : ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();}
           System.out.println("Elements are : ");
           for(int i =0;i<n;i++){
            System.out.println(arr[i]);
           }
           System.out.println("enter the target: ");
      int target = sc.nextInt(); 
      System.out.println(nextGreaterElem(arr, target));  

    sc.close();}
}

