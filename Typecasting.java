public class Typecasting {
    public static void main(String args[]){
        //widening->smaller to higher datatype
        //byte->short->char->int->long->float->double
        int x=10;
        double y=x;
        System.out.println(y);
        //narrowing->higher to smaller datatype
        //double->float->long->int->char->short->byte
        double a=12.3456;
        int b=(int)a;
        System.out.println(b);
    }
}
