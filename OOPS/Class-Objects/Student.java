
class Student_Details{
    private String name;
    private int marks,roll;

    public Student_Details(String name,int roll,int marks){
        this.marks=marks;
        this.name=name;
        this.roll=roll;
    }

    public void printStudentDetails(){
       System.out.println("Roll Number: "+roll+"\nStudent Name: "+name+"\nMarks: "+marks);
    }
}

public class Student {
    public static void main(String as[]){
       
        Student_Details student = new Student_Details("Pradip", 1, 466);
        student.printStudentDetails();

        Student_Details studen2 = new Student_Details("Raj", 2, 403);
        studen2.printStudentDetails();
        Student_Details studen3 = new Student_Details("Vipasha", 3, 401);
        
        studen3.printStudentDetails();
    }
}
