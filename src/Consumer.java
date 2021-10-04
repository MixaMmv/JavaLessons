import java.util.concurrent.LinkedBlockingQueue;

public class Consumer extends Thread{

    private int time;
    private LinkedBlockingQueue linkedBlockingQueue;


    public Consumer(int time, LinkedBlockingQueue linkedBlockingQueue) {
        this.time = time;
        this.linkedBlockingQueue = linkedBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(time);
                if(linkedBlockingQueue.poll() != null) System.out.println("Consumed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

