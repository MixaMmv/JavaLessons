public class SecondsWaiter extends Thread {

    private int time;
    private Chronometer chronometer;
    private int sec = 0;

    public SecondsWaiter(int time, Chronometer chronometer) {
        this.time = time;
        this.chronometer = chronometer;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (chronometer) {
                try {
                    chronometer.wait();
                    sec++;
                    if (sec % time == 0) System.out.println(time + " seconds");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
