package Accenture.Practice;
import java.util.*;

public class ReveString {
    public static String reverse(int idx,String str){
        if(idx==str.length()) return " ";
        String ans=reverse(idx+1, str);
        return ans+str.charAt(idx);
    }
        public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(reverse(0, str));

        sc.close();
    }
}
