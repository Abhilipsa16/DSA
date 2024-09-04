package Accenture.Javaprogs;
import java.util.Scanner;
//The function accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to m(both inclusive) that are not divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by n.
public class Fifth {
    public static int diffSum(int n, int m){
        int sum=0; int sum1=0;
      for(int i=1;i<=m;i++){
        if(i%n==0){
            sum=sum+i;
        }
        else{
            sum1=sum1+i;
        }
      }
      return Math.abs( sum-sum1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(diffSum(n, m));
        sc.close();
    }
}
