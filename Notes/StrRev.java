package Notes;
import java.util.*;
public class StrRev {
    static void reverse(String str ,int id){
        if (id==0) {
            System.out.println(str.charAt(id)); 
        }

        System.out.print(str.charAt(id));
        reverse(str, id-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        reverse(str,str.length()-1);
        sc.close();
    }
    
}
