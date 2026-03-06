public class Stdex1 {
    public static void main(String args[]){
        Student s=new Student(388,"Maneesha",98);
        System.out.println(s.Grades("Grade :")+s.Grades()+"Count :"+s.c);
        Student s1=new Student(65);
        System.out.println(s1.Grades("Grade :")+s1.Grades()+"Count :"+s1.c);
        Student s2=new Student(s);
        System.out.println(s2.Grades("Grade :")+s2.Grades()+"Count :"+s2.c);
    }
}
class Student{
    int rollno;
    String name;
    int marks;
    static int c;
    final double PI=3.14;
    Student(int rollno,String name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
        c++;
    }
    Student(int m){
        marks=m;
        c++;
    }
    Student(Student obj){

    }
    char Grades(){
        if(marks>=90){
            return 'A';
        }
        else if(marks>=80&&marks<90){
            return 'B';
        }
        else if(marks>=70&&marks<80){
            return 'C';
        }
        else if(marks>=60&&marks<70){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    String Grades(String str){
        return str;
    }
}