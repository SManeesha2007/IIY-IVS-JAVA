class Addition{
    int a=2,b=3;
    Addition(){               //constructor
        System.out.println(a+b);
    }
    Addition(int a,int b,int c){   //constructor overloading
        this.a=a;
        this.b=b;
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        Addition a=new Addition();
        Addition a1=new Addition(5,6,7);
    }
}
