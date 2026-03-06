public class MaxMin {
    public static void main(String[] args){
        int a[]={19,34,23,89,45,6,5,3};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Maximum element :"+max);
        System.out.println("Minimum element :"+min);
    }
}
