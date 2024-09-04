package Accenture.Javaprogs;
import java.util.Scanner;
/*A denotes AND operation
– B denotes OR operation
– C denotes XOR Operation */
public class Second {
    public static int operationBinaryString(String str){
        if(str==null) return -1;
      int res=str.charAt(0)-'0';//typecasting to int
      for(int i=1;i<str.length();){
        char prev=str.charAt(i);
      i++;
      if(prev=='A') res=res &(str.charAt(i)-'0');
      else if (prev=='B') res = res |(str.charAt(i)-'0');
      else res= res ^(str.charAt(i)-'0');
      i++;
      }
    return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Enter a string" +str);
        System.out.println(operationBinaryString(str));
    sc.close();
    }
    
}
