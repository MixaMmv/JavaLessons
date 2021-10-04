import java.util.concurrent.LinkedBlockingQueue;

public class Producer extends Thread{

    private int time;
    private LinkedBlockingQueue linkedBlockingQueue;


    public Producer(int time, LinkedBlockingQueue linkedBlockingQueue) {
        this.time = time;
        this.linkedBlockingQueue = linkedBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(time);
                if(linkedBlockingQueue.offer("Stradanie")) System.out.println("Produced");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
