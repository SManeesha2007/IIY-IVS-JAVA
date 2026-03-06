public class ClassesDemo {
    public static void main(String args[]){
        Classes c=new Classes(10.5,7.3,3.5);
        System.out.println("volume :"+c.volume()+"count :"+c.count);
        Classes c1=new Classes(10.0,7.0,3.0);
        System.out.println(c1.volume("volume :")+c1.volume()+"count :"+c1.count);
        Classes c2=new Classes();
        System.out.println(c2.volume("volume :")+c2.volume()+"count"+c2.count);
        Classes c3=new Classes(c2);
        System.out.println(c3.volume("volume :")+c3.volume()+"count"+c3.count);
    }
}
class Classes{
    double len;
    double wid;
    double hei;
    static int count=0;
    final int X=0;
    Classes(double len,double wid,double hei){
        this.len=len;
        this.wid=wid;
        this.hei=hei;
        count++;
    }
    Classes(){

    }
    Classes(Classes c){
        
    }
    double volume(){
        return len*wid*hei;
    }
    String volume(String str){
        return str;
    }
}