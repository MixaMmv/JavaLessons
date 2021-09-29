import sun.reflect.generics.tree.Tree;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, TestSubject> hashMap = new HashMap<>();
        String selectedString = "";

        for (int i = 0; i < 100; i++) {
            TestSubject subject = new TestSubject(i);
            hashMap.put(subject.getId(), subject);
            if (i == 27) {
                selectedString = subject.getId();
            }
        }
        System.out.println(hashMap);
        System.out.println(hashMap.get(selectedString));
        System.out.println(hashMap.get(selectedString).getId());


        if (hashMap.get(selectedString).getId() == selectedString) {
            System.out.println("TRUE");
        } else System.out.println("FALSE");

        TreeMap<Integer, TestSubject> subjectTreeMap = new TreeMap<>(new TestComparator());


        for (int i = 0; i < 100; i++){
            TestSubject subject = new TestSubject(i);
            subjectTreeMap.put(subject.getOrdinal(), subject);
        }

        System.out.println(subjectTreeMap.lastEntry());

        Parser parser = new Parser();
        ArrayList<String> list = null;

        File file = new File("voyna-i-mir-tom-1.txt");
        try {
            list = parser.parse(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


        ///������� 1 - ���������� ���������

        int count = 0;

        for (String str : list){
//            System.out.println(str);
            if (str.toLowerCase().contains(" ��������")) count++;
        }
        System.out.println("���������� ���������� = " + count); //12

        ///������� 2 - ���������� ��������� ����� �������

        list = null;
        count = 0;
        list = parser.parse2(file);
        for (String str : list){
//            System.out.println(str);
            if (str.toLowerCase().contains("��������")) { count++;
                System.out.println(str);}
        }
        System.out.println("���������� ���������� = " + count); //15

        // (����������� ����� � ����������, �� ����� ���� �� ������� �����, � �� �� ������, ��� ������ ���� ������. ����� ����������� �������� contains ����������)



        ///������� 3 - ������� ���������

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i*j);
                System.out.print(' ');
            }
            System.out.println();
        }


    }
}
