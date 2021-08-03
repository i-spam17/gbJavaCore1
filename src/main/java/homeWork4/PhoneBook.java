package homeWork4;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Array;
import java.util.*;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void addValues(String surname, String phoneNumber) {
        ArrayList<String> phoneList = new ArrayList();
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.containsKey(surname)) {
                phoneList.add(phoneNumber);
            } else {
                phoneBook.put(surname,phoneList);
            }
        }

        ArrayList<String> morePhonesForSurname = new ArrayList();
        morePhonesForSurname.add(phoneNumber);
        phoneBook.put(surname, morePhonesForSurname);
    }

    public ArrayList<String> getList(String surname) {
        return phoneBook.get(surname);
    }

    @Override
    public String toString() {
        return "phoneBook=" + phoneBook +
                '}';
    }
}
