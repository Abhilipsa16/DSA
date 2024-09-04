import java.util.Scanner;

public class thirteen {
    public static int calculate(int a,int b)
    {
        int sum=0;
      for(int i=a+1;i<b;i++){
        if(i%3==0&&i%5==0){
          sum=sum+i;
        }
      }return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculate(a, b));


        sc.close();
    }
}
