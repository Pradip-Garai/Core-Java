
public class Default {

    public Default(){
        System.out.println("Hello I am Default Constractor");
    }

    public void stop(){
        System.out.println("Programme is terminated....");
    }

    public static void main(String as[]){
        Default d=new Default();
        d.stop();
    }
}
