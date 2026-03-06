import java.util.Scanner;
public class ReadingInput {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        byte b=sc.nextByte();
        short s=sc.nextShort();
        int i=sc.nextInt();
        long l=sc.nextLong();
        char ch=sc.next().charAt(0);
        String s1=sc.next();
        sc.nextLine();
        String s2=sc.nextLine();
        System.out.println("Byte :"+b);
        System.out.println("short:"+s);
        System.out.println("Int :"+i);
        System.out.println("Long :"+l);
        System.out.println("char :"+ch);
        System.out.println("string1 :"+s1);
        System.out.println("string2 :"+s2);
    }
}
