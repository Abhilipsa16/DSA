package Accenture.Javaprogs;
import java.util.Arrays;
import java.util.Scanner;

public class seventh {
    public static int productSmallPair(int sum,int n,int arr[]){
    //int temp;
    int check;
    if(n<2) return -1;
    //  for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         if(arr[i]>arr[j]){
    //             temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //         }

    //     }
       
    //  }
    Arrays.sort(arr);
     check=arr[0]+arr[1];//two pair least number;
    if(check<=sum)
    return arr[0]*arr[1];
    else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=sc.nextInt();
        int n =sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
           System.out.println(productSmallPair(sum,n,arr));
           sc.close();
    }
}
