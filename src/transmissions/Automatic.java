package transmissions;

public class Automatic implements Transmission{
    @Override
    public String goDrive() {
        return "go on 4 speeds";
    }

    @Override
    public String suspiciousSound() {
        return "knock knock knock knock";
    }
}
