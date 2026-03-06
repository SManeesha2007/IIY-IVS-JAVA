import java.util.StringTokenizer;
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String str="welcome to java programming";
        StringTokenizer st=new StringTokenizer(str);
        String str1="welcome to python@programming";
        StringTokenizer st1=new StringTokenizer(str1,"@");   //by default delimeter will be space(" ")
        System.out.println("count of token : "+st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());   //nextToken will print the current token and points to next token
        }
        System.out.println("count of token(st1) : "+st1.countTokens());
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());   //nextToken will print the current token and points to next token
        }
    }
}
