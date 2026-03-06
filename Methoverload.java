class Methoverload {
    int a=2,b=3;
    void add(){
        System.out.println("without parameters "+(a+b));
    }
    int add(int a,int b){
        this.a=a;
        this.b=b;
        return a+b;
    }
    void add(int a,int b,int c){
        this.a=a;
        this.b=b;
        System.out.println("with 3 parameters "+(a+b+c));
    }
    public static void main(String[] args){
        Methoverload m=new Methoverload();
        m.add();
        System.out.println("with 2 parameters"+m.add(5,6));
        m.add(7,8,9);
    }
}
