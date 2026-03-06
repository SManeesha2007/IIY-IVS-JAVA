class Add{
    static int add(int a,int b) {             //static method means using static keyword in the method
        return a+b;
    }
}
public class StaticMethodex1 {
    public static void main(String[] args) {
        int res=Add.add(3,4);
        System.out.println(res);
    }
}