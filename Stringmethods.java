import java.util.Arrays;
public class Stringmethods {
    public static void main(String[] args) {
        String s1="java programming";
        String s2="python programming";
        String s3="j@v@";
        String s4="PYThon";
        String s5="java is fun,java is powerful language";
        String s6="  java";
        //length
        System.out.println(s1.length());
        //charAt
        System.out.println(s2.charAt(7));
        //equals
        System.out.println(s1.equals(s3));
        //equalsignorecase
        System.out.println(s1.equalsIgnoreCase(s3));
        //indexof
        System.out.println(s1.indexOf('a'));
        //lastindexof
        System.out.println(s1.lastIndexOf('a'));
        //replace
        System.out.println(s1.replace('a','@'));
        //replacefirst
        System.out.println(s5.replaceFirst("java","python"));
        //replaceall
        System.out.println(s3.replaceAll("@","#"));
        //touppercase
        System.out.println(s3.toUpperCase());
        //tolowercase
        System.out.println(s4.toLowerCase());
        //trim
        s6=s6.trim();
        System.out.println(s6);
        //substring
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5,13));
        System.out.println(s1.contains("java"));
        //compare to
        System.out.println(s1.compareTo(s2));
        //tocharArray
        char ch[]=s2.toCharArray();
        System.out.println(Arrays.toString(ch));
        //split
        String str[]=s5.split(" ");
        System.out.println(Arrays.toString(str));
        //concat
        s1=s1.concat(s2);
        System.out.println(s1);
        //isempty
        System.out.println(s1.isEmpty());
    }
}
