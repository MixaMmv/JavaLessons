import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        String hello = "Hello";
        String world = "world";

        int a = 10;

        double d1 = 1.00001;
        double d2 = 1.00000999999;

        BigDecimal one = new BigDecimal(d1);
        BigDecimal two = new BigDecimal(d2);

        StringBuilder builder = new StringBuilder(hello + ' ' + world);
        builder.replace(6,11, "Java");

        System.out.println(hello + ' ' + world);
        System.out.println(one.compareTo(two));
        System.out.println(builder);

    }

}
