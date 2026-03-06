//a string can be pangram when every letter of alphabet should be in the string
public class Stringpangram {
    static boolean checkpangram(String str){
        boolean b[]=new boolean[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                b[ch-'A']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(!b[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="the quick brown fox jumps over the lazy dog";
        System.out.println(checkpangram(str.toUpperCase()));
    }
}
