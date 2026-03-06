public class Stringex1 {
    public static void main(String[] args) {
        String s1="java"; //when we use literals the string uses constant pole 
        String s2="java";
        String s3=new String("java"); //when we use new then the string uses both constant pole and heap to store the reference 
        System.out.println(s1==s2);// check references
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));// check values
        System.out.println(s1.equals(s3));
        s1=s1.concat("programming");
        System.out.println(s1);
    } 
}
