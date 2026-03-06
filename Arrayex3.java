import java.util.Scanner;
import java.util.Arrays;
public class Arrayex3 {
       public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter no of elements");
            int n=sc.nextInt();
            System.out.println("enter "+n+" elements");
            int[] a=new int[n];
            int[] b=new int [n];
            for(int i=0;i<n;i++){
                System.out.print("enter a["+i+"] value :");
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                System.out.print("enter b["+i+"] value :");
                b[i]=sc.nextInt();
            }
            System.out.println("before sorting");
            for(int i=0;i<n;i++){
                System.out.println("a["+i+"] value --> "+a[i]);
            }
            maxmin(a,n);
            sortArray(a,n);
            System.out.println("after sorting");
            for(int i=0;i<n;i++){
                System.out.print("  "+a[i]);
            }
            System.out.print("\n");
            int l=removedup(b,n);
            for(int i=0;i<l;i++){
                System.out.print("  "+b[i]);
            }
            System.out.print("\n");
       }
       static void sortArray(int[] a,int n){
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]>a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
       }
       static void maxmin(int[] a,int n){
            int max=a[0];
            int min=a[0];
            for(int i=0;i<n;i++){
                if(a[i]>max){
                    max=a[i];
                }
                if(a[i]<min){
                    min=a[i];
                }
            }
            System.out.println("maximum : "+max);
            System.out.println("minimum : "+min);
       }
       static int removedup(int[] b,int n){
            int i=0;
            for(int j=1;j<n;j++){
                if(b[i]!=b[j]){
                    i++;
                    b[i]=b[j];
                }
            }
            return i+1;
       }
}
