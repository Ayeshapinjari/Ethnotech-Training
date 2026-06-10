package LearningThreads.Threads.basics;
//we have 2 seats 2 threads try to book tickets, t1 wants 2 seats and t2 want two seats
//book tickets and show necessary message like tickets have or not
// to avoid race condiyion we use synchronise

public class BookMyShow {
    int seats=2;
    public synchronized void bookTickets(){
        if(seats>0){
            seats--;
            System.out.println("ticket booked successfully");
        }
        else{
            System.out.println("no tickets left");
        }
    }
    public static void main(String[] args) throws InterruptedException {
       BookMyShow b=new BookMyShow();
       Thread t1=new Thread(()->{
           for (int i = 1; i <=2; i++) {
               b.bookTickets();
           }
       });
        Thread t2=new Thread(()->{
            for (int i = 1; i <=2; i++) {
                b.bookTickets();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
