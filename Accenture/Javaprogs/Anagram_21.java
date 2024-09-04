package Accenture.Javaprogs;
import java.util.*;
public class Anagram_21 {
    public static boolean checkAnagram(String s , String t){
        s=s.toLowerCase();
        t= t.toLowerCase();
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }else{return false;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(checkAnagram(s, t));
    sc.close();
}
}
