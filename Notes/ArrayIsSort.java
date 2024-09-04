package Notes;

import java.util.Scanner;

public class ArrayIsSort {
    static boolean isSorted(int arr[],int idx){
     if(idx==arr.length-1) return true;
     if(arr[idx]<arr[idx+1]) return isSorted(arr, idx+1);
        else return false;
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println(isSorted(arr, 0));
        sc.close();
    }
}
