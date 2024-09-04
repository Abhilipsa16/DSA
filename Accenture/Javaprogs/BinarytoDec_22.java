package Accenture.Javaprogs;
import java.util.*;
public class BinarytoDec_22 {
    public static int convert(int n){
        int ans =0;
        int base =1 ;
        while(n>0){
           int lastbit = n%10;
           ans = ans + lastbit*base;
           base = base*2;
           n=n/10;

        }return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(convert(n));
   sc.close(); }
}
