public class myThread extends Thread {

   @Override
   public void run(){
     System.out.println("RUNNING");

     try{

        Thread.sleep(2000);
        int a = 100;
        int b = 199;
        System.out.println(a+b);

     }catch(InterruptedException e){
        System.out.println(e);
     }
   }
   public static void main(String as[])throws InterruptedException {
     
    myThread t1 = new myThread();
    System.out.println(t1.getState());

    t1.start();
    System.out.println(t1.getState());
     
    Thread.sleep(100);

    System.out.println(t1.getState());
    t1.join();
    System.out.println(t1.getState());

   }
}
