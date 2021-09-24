package transmissions;

public class Manual implements Transmission{
    @Override
    public String goDrive() {
        return "go on 6 speeds";
    }

    @Override
    public String suspiciousSound() {
        return "crunch crunch crunch";
    }
}
