package Polymorphism;

class Animal{
    public void sound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal{

    @Override
    public void sound(){
        System.out.println("Dogs Barks");
    }
}

class Cat extends Animal{

    @Override
    public void sound(){
        System.out.println("Cat Meow");
    }
}

public class MethodOverriding {
    public static void main(String as[]){
       Animal a=new Animal();
       a.sound();

       Animal ob=new Dog();
       ob.sound();

       Animal ob2=new Cat();
       ob2.sound();
    }
}
