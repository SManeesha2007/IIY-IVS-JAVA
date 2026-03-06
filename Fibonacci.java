public class Fibonacci {
    public static void main(String[] args){
        int n=20;
        int a=0,b=1,sum=0;
        while(a<=n){
            if(a%2==0){
                sum+=a;
            }
            int next=a+b;
            a=b;
            b=next;
        }
        System.out.println("The even terms upto "+n+" is "+sum);
    }
}

