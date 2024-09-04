package Accenture.Javaprogs;
import java.util.*;
//(0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:A,11:B and so on upto 35:Z)
/*Input
n: 12
num: 718

Output
4BA */

public class Eighth {
    public static String nBaseNotation(int n,int num){
        String res = "";
        int quotient = num / n;
          ArrayList < Integer > rem = new ArrayList < Integer > ();
          rem.add (num % n);
        while (quotient != 0)
          {
        rem.add (quotient % n);
        quotient = quotient / n;
          }
        for (int i = 0; i < rem.size (); i++)
          {
        if (rem.get (i) > 9)
          {
            res = (char) (rem.get (i) - 9 + 64) + res;
          }
        else
          res = rem.get (i) + res;
          }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        System.out.println(nBaseNotation(n,num));
        sc.close();
    }
}
