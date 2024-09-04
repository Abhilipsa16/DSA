package Notes;

import java.util.Scanner;

public class MoveX {
    public static String moveAllx(String str,int id,String newString){
        if (str.length()==id) {
            return newString;
        }
        if (str.charAt(id)=='x') {
            String ans = moveAllx(str, id+1, newString) +'x';
            return ans;
            
        }
        else{
            String ans=moveAllx(str, id, newString+str.charAt(id));
            return ans;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(moveAllx(str, 0, ""));
        
        sc.close();
    }
}
