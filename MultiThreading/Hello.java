public class Hello {
    public static void main(String as[]){

        World w = new World(); // NEW Thread (Created but not started)
        w.start(); // RUNNABLE (Ready to run and waiting got CPU Time)
        
        for(;;){
            System.out.println("Hello");
        }
    }
}
