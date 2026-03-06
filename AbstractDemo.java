abstract class Shapes{
    void closed(){
        System.out.println("it is a closed shape");
    }
    abstract void area();
}
class Rectangle extends Shapes{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    void area(){
        System.out.println("Area of Rectangle :"+l*b);
    }
}
class Square extends Shapes{
    int a;
    Square(int a){
        this.a=a;
    }
    void area(){
        System.out.println("Area of a Square :"+a*a);
    }
}
class Triangle extends Shapes{
    int b,h;
    Triangle(int b,int h){
        this.b=b;
        this.h=h;
    }
    void area(){
        System.out.println("Area of Triangle : "+0.5*b*h);
    }
}
class Circle extends Shapes{
    int r;
    Circle(int r){
        this.r=r;
    }
    void area(){
        System.out.printf("Area of Circle : %.3f\n",2*3.14*r);
    }
}
public class AbstractDemo {
    public static void main(String[] args){
        Rectangle r=new Rectangle(3,4);
        Square s=new Square(8);
        Triangle t=new Triangle(4,8);
        Circle c=new Circle(5);
        Shapes[] sh={r,s,t,c};
        for(Shapes x:sh){
            x.closed();
            x.area();
        }
    }
}
