package Accenture.Practice;

import java.util.Scanner;

public class PalStr {
    public static boolean isPallindrome(String str){
        String rev = reverse(0, str);
        if (str.equals(rev)) {
            return true;
        }return false;

    }
    static String reverse(int idx,String str){
        if(str.length()==idx) return "";
        String ans=reverse(idx+1, str);
        return ans+str.charAt(idx);
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPallindrome(str));
        sc.close();

    }
}
