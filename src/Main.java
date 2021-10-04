import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) {


        Thread thread1 = new Thread() {
            Integer time = 0;

            @Override
            public void run() {
                while (true) {
                    try {
                        sleep(1000);
                        time++;
                        System.out.println(time + " seconds left");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        Chronometer chronometer = new Chronometer();
        SecondsWaiter secondsWaiter5 = new SecondsWaiter(5, chronometer);
        SecondsWaiter secondsWaiter7 = new SecondsWaiter(7, chronometer);

//        chronometer.start();
//        secondsWaiter5.start();
//        secondsWaiter7.start();


        //////////////////////////////

        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(3);
        Producer producer = new Producer(700, linkedBlockingQueue);
        Consumer consumer = new Consumer(900, linkedBlockingQueue);
        producer.start();
        consumer.start();

    }
}
