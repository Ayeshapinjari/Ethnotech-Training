package LearningThreads.Threads.basics;
//synchronise-
class MyRace{
    int count=0;
    //method sync
    public synchronized void increment(){
        //block sync
//        synchronized (this) {
//            count++;
//        }
        count++;
    }
}
public class RC {
    public static void main(String[] args) throws InterruptedException {
    MyRace r=new MyRace();
    Thread t1=new Thread(()->
    {
        for (int i = 1; i <=1000; i++) {
            r.increment();
        }
    });
    Thread t2=new Thread(()->
        {
            for (int i = 1; i <=1000; i++) {
                r.increment();
            }
        });
    t1.start();
    t2.start();
    // without join we will gwt random output and main thread also work. so we join t1 t2 to execute
    t1.join();
    t2.join();
        System.out.println(r.count);
    }
}
