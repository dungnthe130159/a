package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create list with no parameter
        List<String> list1 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            // Add element to list
            list1.add("0" + i);
        }
        System.out.print("Init list1 = ");
        printData(list1);

        // List can add one or more null values
        list1.add("");
        list1.add(null);
        list1.add("null");
//        String s = null;
//        s.toLowerCase();
        String s1 = "";
        s1.toLowerCase();
        System.out.print("Init list1(add null) = ");
        printData(list1);

        // addAll()
        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.add("0" + 3);
        System.out.print("After list1.addAll(03): list2 = ");
        printData(list2);

        // IndexOf()
        System.out.println("list2.indexOf(03) = " + list2.indexOf("03"));
        System.out.println("list2.indexOf(06) = " + list2.indexOf("06"));

        // lastIndexOf()
        System.out.println("list2.lastIndexOf(03) = " + list2.lastIndexOf("03"));

        // Remove
        list2.remove("01");
        System.out.print("After list2.remove(01): list2 = ");
        printData(list2);

        // retainAll()
        List<String> list4 = new ArrayList<>(list1);
        List<String> list3 = new ArrayList<>();
        list3.add("0" + 3);
        list3.add("0" + 2);
        System.out.print("Init list3 = ");
        printData(list3);
        list4.retainAll(list3);
        System.out.print("After list1.retainAll(list3): list4 = ");
        printData(list4);

        // removeAll()
        List<String> list5 = new ArrayList<>(list1);
        list5.removeAll(list3);
        System.out.print("After list1.removeAll(list3): list5 = ");
        printData(list5);
    }

    public static void printData(List<String> list) {
        // Show list through for-each
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
