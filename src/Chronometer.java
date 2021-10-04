public class Chronometer extends Thread {

    private int time = 0;


    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
                synchronized (this) {
                    time++;
                    System.out.println("1 second");
                    notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
