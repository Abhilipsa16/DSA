package Accenture.Javaprogs;
/*Input:

arr: 12 3 14 56 77 13
num: 13
diff: 2
Output:
3
*/
import java.util.Scanner;

public class Fourth {
    public static int findCount(int arr[],int l,int num,int diff){
       int count=0;
       int val=0;
       for(int i=0;i<l;i++){
        val=Math.abs(num-arr[i]);
        if(val<=diff){
            count++;
        }
    }return count > 0 ? count: -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l = sc.nextInt();
        int arr[]=new int[l];
        for(int i =0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        int num =sc.nextInt();
        int diff = sc.nextInt();
        System.out.println(findCount(arr, l, num, diff));
        sc.close();
    }
}
