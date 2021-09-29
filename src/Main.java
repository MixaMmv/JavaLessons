import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    public static void main(String[] args) {
//        testArrList();
        testLinkList();
    }

    public static void testLinkList(){
        LinkedList<Integer> linkedList = new LinkedList<>();

    }

    public static void testArrList(){
        ArrayList<Integer> arrayList = new ArrayList<>();

        Integer a = 2;
        arrayList.add(a);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1,3);
        arrayList.add(4);
        arrayList.add(5);

        for (Integer i : arrayList){
            System.out.println(i);
        }

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.indexOf(a));
        System.out.println(arrayList.indexOf(999));

        arrayList.remove(3);
        arrayList.remove(a);

        for (Integer i : arrayList){
            System.out.println(i);
        }
    }

}
