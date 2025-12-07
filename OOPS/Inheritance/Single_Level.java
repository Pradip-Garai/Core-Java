package Inheritance;

class Parent{
    protected String name;
    protected int age;

    Parent(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class Child extends Parent{
    private String studentId,grade;

    public Child(String name,int age,String sId,String grade){
       super(name,age);
       this.grade=grade;
       studentId=sId;
    }

    public void showDetails(){
        System.out.println("Parent Name: "+name+"\nage: "+age);
        System.out.println("Student Id: "+studentId+"\nGrade: "+grade+"\n");
    }

}

public class Single_Level {

    public static void main(String as[]){
       Child c1 = new Child("Sadhan Garai", 47, "S001", "E");
       c1.showDetails();

       Child c2 = new Child("Raj Sign", 51, "S003", "O");
       c2.showDetails();
    }
    
}
