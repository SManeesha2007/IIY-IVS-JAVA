public class Typeofvar {
    static int x=10; //static variable
    int y=20;        //instance variable
    void show(){
        int z=30;   //local variable
        System.out.println("static :"+x);
        System.out.println("instance :"+y);
        System.out.println("local :"+z);
    }
}
class Demo1{
    public static void main(String args[]){
        Typeofvar obj=new Typeofvar();
        obj.show();
        Typeofvar obj1=new Typeofvar();
        obj1.y=40;
        obj1.show();
    }
}