package OOPS.Constractor;

class Employee{
    private String name,role;
    private int salary;

    Employee(String name,String role,int salary){
        this.name=name;
        this.role=role;
        this.salary=salary;
    }

    public void empDetails(){
        System.out.println("Name: "+name+"\nRole: "+role+"\nSalary: "+salary);
    }
}

public class Paramiterize {
    public static void main(String as[]){
        Employee emp1 = new Employee("Pradip Garai","Software Engineer", 80000);
        emp1.empDetails();
    }
}
