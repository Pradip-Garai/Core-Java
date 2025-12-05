

abstract class Area{
    abstract public void area();
}

class Square extends Area{
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public void area(){
        double ar = side*4;
        System.out.println("Area of Square is : "+ar);
    }
}

class Rectangle extends Area{
    private double length,width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void area(){
      double ar = length*width;
      System.out.println("Area of Rectangle is : "+ar);
    }
}

public class AbstractClass {
    public static void main(String as[]){
       
        Square s=new Square(12.56);
        s.area();

        Rectangle r=new Rectangle(23.12,32.20);
        r.area();
    }
}
