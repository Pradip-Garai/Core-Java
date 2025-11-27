public class ThreadMethods extends Thread {

    @Override
    public void run(){

        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" - Priority"+Thread.currentThread().getPriority()+"-Count : "+i);
            
            try{

                Thread.sleep(100);

            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String as[]) throws InterruptedException{
       
        ThreadMethods th = new ThreadMethods();
        th.start();
        th.join();
        System.out.println(th.getState());
    }
}
