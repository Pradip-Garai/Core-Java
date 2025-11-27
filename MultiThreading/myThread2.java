public class myThread2 extends Thread {

    @Override 
    public void run(){
        System.out.println("Thread is running....");

        for(int i=1;i<=5;i++){

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }

            System.out.println(i);
        }
    }
    public static void main(String as[]) throws InterruptedException{

        myThread2 th = new myThread2();
        th.start();
        th.join();
        System.out.println(th.getState());
    }
}

// start, sleep, run, join