public class StringBuilderex1 {         
    //string is immutable and if we want to update it automatically create another object so to avoid the creation of another obj we use string builder and string buffer
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        // to check the capacity which tells u how many elemnts it can hold we use StringBuildername.capacity() function
        System.out.println("intial capacity of sb : "+sb.capacity());
        //to increase capacity it use (old capacity*2)+2
        sb.append("svkhsfijlgjgnagfknvkblfjdvnj");
        System.out.println("length : "+sb.length());
        System.out.println("new capacity : "+sb.capacity());
    }
}
