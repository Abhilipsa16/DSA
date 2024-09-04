package Accenture.Javaprogs;
import java.util.Scanner;

public class ninth {

    public static String moveHyphen(String str){
        String res ="";
        for (int i =0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                res= str.charAt(i)+res;
            }
            else res=res+str.charAt(i);
        }return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        System.out.println(moveHyphen(str));
        sc.close();
    }
}
