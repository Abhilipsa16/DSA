package Accenture.Javaprogs;
import java.util.Scanner;

public class DectoBin_24 {
    public static void  convert(int n){
        for(int i=n-1;i>=0;i--){
            int k = n>>i;
            if((k & 1)>0){//remainder 0 or 1
               System.out.print("1");
            }else{
                System.out.print("0");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Decimal numbr is: "+n);
       
        System.out.print("Binary is ");
       convert(n);
        sc.close();
    }
}
