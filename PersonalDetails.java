public class PersonalDetails {
    static void personalinfo(String name,int age){
        System.out.println("Name :"+name+" age :"+age);
    }
    static void profinfo(String company,int salary){
        System.out.println("company :"+company+" salary :"+salary);
    }
    public static void main(String[] args){
        System.out.println("personal info");
        personalinfo("Maneesha",19);
        System.out.println("professional info");
        profinfo("MNC",200000);
    }
}
