import java.util.*;
import java.lang.*;
public class Armstrong {
    public static void main(String[] args){
        int n=153;
        int temp=n;
        int sum=0;
        int digits=0;
        while(temp>0){
            digits++;
            temp/=10;
        }
        temp=n;
        while(temp>0){
            int rem=temp%10;
            sum+=Math.pow(rem,digits);
            temp/=10;
        }
        if(sum==n){
            System.out.println(n+" is Armstrong number");
        }
        else{
            System.out.println(n+" is not Armstrong number");
        }
    }
}
