import java.util.Scanner;
public class ReadDetails {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your details :");
        int rollno=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        
        String branch=sc.nextLine();
        System.out.println("Rollno :"+rollno);
        System.out.println("name :"+name);
        System.out.println("branch :"+branch);
    }
}
