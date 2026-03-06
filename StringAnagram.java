//Anagram means using same characters we have to make another word ex:cat,act
import java.util.Arrays;
public class StringAnagram {
    static boolean checkAnagram(String s1,String s2){
        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        if(s1.length()==s2.length()){
            Arrays.sort(c1);
            Arrays.sort(c2);
        }
        return (Arrays.equals(c1,c2));
    }
    public static void main(String[] args) {
        if(checkAnagram("Sil ent","List  en")){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
