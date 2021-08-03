package homeWork4;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

public class TestPhoneBook {


    public static void main(String... arg) {
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        //добавление в телефонный справочник
        multimap.put("Ivanov", 11111111);
        multimap.put("Ivanov", 22222222);
        multimap.put("Petrov", 33333333);
        multimap.put("Sidorov", 44444444);

        System.out.println(multimap);

        //поиск по фамилии
        System.out.println(multimap.get("Ivanov"));

    }


}
