class Add1{
    int add(int a,int b){
        return a+b;              //instance method is an another type of method which can be accessed by obj
    }
}
public class InstanceMethodex1 {
    public static void main(String[] args) {
        Add1 obj=new Add1();
        System.out.println(obj.add(3,4));
    }
}
