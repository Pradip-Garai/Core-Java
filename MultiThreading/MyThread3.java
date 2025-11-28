public  class MyThread3 extends Thread{

    public MyThread3(String name){
        super(name);
    }

    @Override 
    public void run(){
       for(int i=0;i<5;i++){
          System.out.println(Thread.currentThread().getName() +"- Priority: "+Thread.currentThread().getPriority()+"-count: "+i);

          try{

            Thread.sleep(100);

          }catch(InterruptedException e){
             System.out.println(e);
          }
       }
    }
    public static void main(String as[]){
       MyThread3 th=new MyThread3("Pradip");
       th.start();
    }
}