public class twodimarr {
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int a[]:arr){
            for(int n:a){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
/*
public class twodimarr{
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/

//to convert 2d array to string
//System.out.println(Arrays.deepToString(arr))
//to check 2d array equality
//System.out.println(Arrays.deepEquals(arr1,arr2))