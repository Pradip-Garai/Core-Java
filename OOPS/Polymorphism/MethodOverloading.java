package Polymorphism;

class Addtion{
    public void add(int a,int b){
        System.out.println("Sum: "+(a+b));
    }

    public void add(int a,int b,int c){
        System.out.println("Sum: "+(a+b+c));
    }

    public void add(double a,double b){
        System.out.println("Sum: "+(a+b));
    }
}

public class MethodOverloading {
    public static void main(String as[]){
        Addtion a1 = new Addtion();
        a1.add(10,20);
        a1.add(10,12,13);
        a1.add(2.5,2.5);
    }
}
