import java.util.Scanner;

public class twelve {
    public static int OperationChoices(int c,int a,int b)
    {
      if (c==1) return a+b;
      else if(c==2) return a-b;
      else if(c==3) return a*b;
      else if(c==4) return a/b;
        
      return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c =sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(OperationChoices(c, a, b));
        sc.close();
    }
}
