package LearningThreads.Threads.basics;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println(Thread.currentThread().getName());
    MyThread t=new MyThread();
//        System.out.println(t.getState());
        t.start();
//        System.out.println(t.getState());

        for (int i = 1; i <=3; i++) {
            try{
                t.join();// it makes pause main thread and join new thread
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
