public class StringBuildermethods {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java");
        //capacity tells how many characters it can hold
        System.out.println("capacity : "+sb.capacity());
        //length tells how many characters it have
        System.out.println("length : "+sb.length());
        //append
        sb.append("programming");
        //insert an substring
        sb.insert(4,"language");
        System.out.println(sb);
        //replace
        sb.replace(0,4,"python");
        System.out.println(sb);
        //delete will delete a substring
        sb.delete(6,13);
        System.out.println(sb);
        //deleteCharAt will delete only a single character
        sb.deleteCharAt(6);
        System.out.println(sb);
        
    }
}
