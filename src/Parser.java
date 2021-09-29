import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

    public ArrayList<String> parse(File file) throws IOException {
        BufferedReader reader = null;
        ArrayList<String> list = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = reader.readLine();
        while (line != null) {
            list.add(line);
            line = reader.readLine();
        }
        return list;
    }

    public ArrayList<String> parse2(File file) {
        Scanner scanner = null;
        ArrayList<String> list = new ArrayList<>();
        try {
            scanner = new Scanner(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = scanner.next();
        while (scanner.hasNext()) {
            list.add(line);
            line = scanner.next();
        }
        return list;
    }
}
