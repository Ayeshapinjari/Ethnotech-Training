package LearningThreads.Threads.basics;

public class MyThread extends Thread{
    public void run(){
        for (int i = 1; i <=3 ; i++) {
            try{
                Thread.sleep(2000);// it makes a 2s late to execute
                System.out.println(i+" I am new Thread");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
