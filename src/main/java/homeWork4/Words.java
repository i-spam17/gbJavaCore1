package homeWork4;

import java.util.*;
import java.util.stream.Collectors;

public class Words {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("test1");
        stringHashSet.add("test1");
        stringHashSet.add("test2");
        stringHashSet.add("test3");
        stringHashSet.add("test4");
        stringHashSet.add("test5");
        stringHashSet.add("test5");
        stringHashSet.add("test6");
        stringHashSet.add("test7");
        stringHashSet.add("test8");

       System.out.println("вывод уникальных элементов списка - "+stringHashSet);

        System.out.println("------------------\nподсчет количества входов слов (криво):");
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("test1");
        stringArrayList.add("test1");
        stringArrayList.add("test2");
        stringArrayList.add("test3");
        stringArrayList.add("test4");
        stringArrayList.add("test5");
        stringArrayList.add("test5");
        stringArrayList.add("test6");
        stringArrayList.add("test7");
        stringArrayList.add("test8");

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println("слово -" + stringArrayList.get(i) + "- встречается " +
                    Collections.frequency(stringArrayList,stringArrayList.get(i)) + " раз" );
        }

        System.out.println("------------------\nподсчет количества входов слов (с помощью потока):");
        Map<Object, Long> stringIntegerMap =
                stringArrayList.stream().collect(Collectors.groupingBy(e -> e.toString(), Collectors.counting()));
        System.out.println(stringIntegerMap);
    }

}
