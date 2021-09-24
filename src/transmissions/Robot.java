package transmissions;

public class Robot implements Transmission{
    @Override
    public String goDrive() {
        return "go fast on 9 speed";
    }

    @Override
    public String suspiciousSound() {
        return "Humanity will fall";
    }
}
