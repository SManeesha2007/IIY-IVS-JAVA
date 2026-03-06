import java.util.Arrays;
public class Arrayclass1 {
    public static void main(String[] args) {
        int a[]={19,34,23,89,45,6,5,3};
        int b[]={19,34,23,89,45,6,5,3};
        for(int i:a){
            System.out.print(i+ " ");
        }
        System.out.println();
        //to convert int to string
        System.out.println(Arrays.toString(a));
        //to sort an array
        Arrays.sort(a);
        //to sort in a range
        //Arrays.sort(a,0,5);
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        //to fill an array with a particular element
        Arrays.fill(a,7);
        for(int i:a){
            System.out.print(i+ " ");
        }
        System.out.println();
        //create a copy of array
        int newArray[]=Arrays.copyOf(a,10);
        for(int i:newArray){
            System.out.print(i+" ");
        }
        System.out.println();
        //to search an element
        System.out.print(Arrays.binarySearch(b,34));
        System.out.println();
        //to check whether 2 arrays are equal or not
        System.out.print(Arrays.equals(a,b));
    }
}
