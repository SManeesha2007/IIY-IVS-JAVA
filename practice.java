public class practice {
    static boolean checkPangaram(String str){
        boolean b[]=new boolean[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'){
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
    public static void main(String[] args){
        String str="the quick brown fox jumps over the lazy dog";
        System.out.println("It is "+checkPangaram(str.toUpperCase()));
    }
}
