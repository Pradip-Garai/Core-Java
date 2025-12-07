package Inheritance;

class Person{
    protected String name;
    protected int age;

    public Person(String name,int age){
      this.name=name;
      this.age=age;
    }

    public void showPersonDetails(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}


class Employee extends Person{
    protected String empId,department;

    public Employee(String name,String empId,String department, int age){
        super(name,age);
        this.empId=empId;
        this.department=department;
    }

    public void showEmpDetails(){
        showPersonDetails();
        System.out.println("Employee Id: "+empId+"\nDepartment: "+department);
    }
}

class Manager extends Employee{
    private int teamSize;
    private String projectName;

    public Manager(String name,String empId,String department, int age,int teamSize,String projectName){
        super(name,empId,department,age);
        this.projectName=projectName;
        this.teamSize=teamSize;
    }

    public void showManagerDetails(){
        showEmpDetails();
        System.out.println("Project Name: "+projectName+"\nTeam Size: "+teamSize);
    }

}

public class Multi_Level {
    public static void main(String as[]){
       Manager m1=new Manager("Pradip Garai", "Emp001", "Developer", 22, 15,"Email_Fraud_Detection");
       m1.showManagerDetails();
    }
}
