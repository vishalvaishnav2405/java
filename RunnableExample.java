public class RunnableExample implements Runnable {
    public void run(){
        System.out.println("Thread has ended");
    }
    
    public static void main(String[] args){
        RunnableExample a = new  RunnableExample();
        Thread t1 = new Thread(a);
        t1.start();
        System.out.println("Hello World");
    }
}