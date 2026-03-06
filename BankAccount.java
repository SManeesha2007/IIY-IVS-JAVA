class PbankAccount{
    String s="manu";
    double b=45000;
    void deposit(int amount){
        b+=amount;
        System.out.println(b);
    }
    void withdrawl(int amt){
        b-=amt;
        System.out.println(b);
    }
}
class CheckingAmount extends PbankAccount{
    void checking(){
        System.out.println("amount :"+b);
    }
    void withdrawl(int amt){
        b-=amt;
        System.out.println(b);
    }
}
class SavingAmount extends PbankAccount{
    void deposit(int amount){
        b+=amount;
        System.out.println(b);
    }
    void withdrawl(int amt){
        b-=amt;
        System.out.println(b);
    }
}
public class BankAccount {
    public static void main(String[] args){
        SavingAmount s=new SavingAmount();
        CheckingAmount c=new CheckingAmount();
        
    }
}
