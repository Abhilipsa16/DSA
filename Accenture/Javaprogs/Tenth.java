package Accenture.Javaprogs;
import java.util.*;
public class Tenth {
    public static int numbersOfCarry(int num1,int num2){
        int temp1=num1;
        int temp2=num2;
        int count=0, rem=0 ,sum=0; 
        while(temp1!=0&&temp2!=0){
            int d1=temp1%10;
            int d2= temp2%10;
             if (d1+d2+rem>9) 
             {
                count++;
                sum=d1+d2+rem;
                sum=sum/10;
                rem=sum;
             }
             temp1=temp1/10;
             temp2=temp2/10;
        }
        while(temp1!=0){
            int d1=temp1%10;
             if (d1+rem>9) 
             {
                count++;
                sum=d1+rem;
                sum=sum/10;
                rem=sum;
             }
             temp1=temp1/10;
        }
        while(temp2!=0){
            int d2= temp2%10;
             if (d2+rem>9) 
             {
                count++;
                sum=d2+rem;
                sum=sum/10;
                rem=sum;
             }
             temp2=temp2/10;
        }return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(numbersOfCarry(num1, num2));
             sc.close();
    }
}
