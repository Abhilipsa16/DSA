package Accenture.Practice;


import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class OccEle {
  public static void frequency(int arr[]){
    HashMap<Integer,Integer> hs=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(hs.containsKey(arr[i])){
            hs.put(arr[i], hs.get(arr[i])+1);
        }else{
            hs.put(arr[i], 1);
        }
    }
   for (Map.Entry<Integer,Integer>element : hs.entrySet()) {
    
   System.out.println("Element-frequency");
  
System.out.println(element.getKey()+" "+element.getValue());}
}

    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        frequency(arr);
    
    
        sc.close();    }
}
