package Notes;

import java.util.Scanner;

public class FirstLastOcc {
    static int first=-1 ;
    static int last =-1;
    static void occurence(String s,int idx,char ele){
        if (idx==s.length()) {
            System.out.println(first);
            System.out.println(last);
        }
        char currChar=s.charAt(idx);
        if (currChar==ele) {
            if (first==-1) {
                first=idx;
            }else{
                last = idx;
            }
            
        }occurence(s, idx+1, ele);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        char ele= sc.next().charAt(0);
        occurence(s, 0, ele);
        sc.close();
    }
}
