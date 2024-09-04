package Accenture.Javaprogs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*nter the size of array : 5
enter element at 0 index : 3
enter element at 1 index : 4
enter element at 2 index : 1
enter element at 3 index : 7
enter element at 4 index : 9
Sorted even array : 1 3 9
Sorted odd array : 4 7

7 */
public class fiftnth {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n =sc.nextInt();
    int arr[] = new int[n];
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();
    System.out.println("Enter the array elements: ");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
        if (i % 2 ==0) {
            even.add(arr[i]);
        }
        else{
            odd.add(arr[i]);
        }
    }
    Collections.sort(even);
    Collections.sort(odd);
    System.out.println("Sorted even array: ");
    for (int e  : even) {
        System.out.print(e+ " ");
        System.out.println();
    }
    System.out.println("sorted odd array: ");
    for (int e:odd)
      System.out.println (e + " ");
    System.out.println ();
    int evensec = even.get (even.size () - 2);
    int oddsec = odd.get (odd.size () - 2);
    System.out.println ("Second Largest Element in Even List is:" + evensec);
    System.out.println ("Second Largest Element in Odd List is:" + oddsec);
    System.out.println ("Sum Of Second Largest Element Of Odd and Even List:" +
		   (evensec + oddsec));
    

    sc.close();
    }
}
