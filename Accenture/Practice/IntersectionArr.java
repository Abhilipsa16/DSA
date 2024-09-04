//using hashset
package Accenture.Practice;

import java.util.*;

public class IntersectionArr {
    static void printUnion(int[]arr1 , int[]arr2){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println(hs);
    }
    static void printIntersection(int arr1[],int[]arr2){
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
         hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if (hs.contains(arr2[i])) {
                hs1.add(arr2[i]);
            }
            
        }System.out.print(hs1);
    }
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the size of first array:");
     int x = sc.nextInt();
     int arr1[] =new int[x];
     for(int i =0;i<x;i++){
        arr1[i]= sc.nextInt();
     }
     System.out.println("Enter size of second array:");
     int y = sc.nextInt();
     int arr2[]= new int[y];
     for(int i=0;i<y;i++){
        arr2[i]= sc.nextInt();
     }
     printUnion(arr1, arr2);
     printIntersection(arr1, arr2);
     sc.close();   
    }
}
