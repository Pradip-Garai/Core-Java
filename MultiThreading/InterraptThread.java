public class InterraptThread extends Thread{
    
    @Override
    public void run(){
       try{

        Thread.sleep(1000);
        System.out.println("Thread is running...");

       }catch(InterruptedException e){
         System.out.println("Thread interapted: "+e);
       }
    }
    public static void main(String as[]){
       InterraptThread t1 = new InterraptThread();
       t1.start();
       t1.interrupt();
    }
} 