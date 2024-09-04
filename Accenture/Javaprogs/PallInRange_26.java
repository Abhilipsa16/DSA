package Accenture.Javaprogs;
import java.util.Scanner;

public class PallInRange_26 {

    public static void allPall(int n,int m){
        
        for (int i= m+1;i<n;i++){
            if(i==Pallindrome(i)){
                System.out.print(" " +i);
            }
        }

    }
    public static int Pallindrome(int x){
       int ans = 0;
       while(x>0){
       int lastbit = x%10;
        ans = ans *10 +lastbit;
       x=x/10;
    }
     return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        allPall(n, m);
        sc.close();
    }

}
