public class Test1 {
    public static void main(String as[]){

        Test2 test2 = new Test2();
        Thread t = new Thread(test2);

        t.start();

        for(;;){
            System.out.println("Test1");
        }
    }
}
