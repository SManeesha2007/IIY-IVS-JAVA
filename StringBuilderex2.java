public class StringBuilderex2 {     //string builder is not synchronization or not a thread safe
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java");   // if we give a string in this new itself then the capacity will be length+capacity
        System.out.println("length : "+sb.length());
        System.out.println("capacity : "+sb.capacity());
    }
}
