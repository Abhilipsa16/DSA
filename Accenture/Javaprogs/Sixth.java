package Accenture.Javaprogs;
import java.util.ArrayList;
// sum of second largest  element from the even positions and second smallest from the odd position of given ‘arr’
import java.util.Collections;
import java.util.Scanner;

public class Sixth {
    public static int largeSmallSum(int arr[]){
        if (arr.length<= 3)
      return 0;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        even.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
           Collections.sort (even);
           Collections.sort(odd);
           //System.out.println(even.size());


        }
        return even.get(even.size()-2) + odd.get(odd.size()-2);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
         int arr[]=new int[n];
         for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         System.out.println(largeSmallSum(arr));
        sc.close();
    }
}
