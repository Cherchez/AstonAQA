package Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneDirectory {
    private Map<String, List<String>> TelephoneDirectory;

    public TelephoneDirectory() {
        this.TelephoneDirectory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (TelephoneDirectory.containsKey(lastName)) {
            TelephoneDirectory.get(lastName).add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            TelephoneDirectory.put(lastName, phoneNumbers);
        }
    }

    public List<String> get(String lastName) {
        return TelephoneDirectory.getOrDefault(lastName, new ArrayList<>());
    }
}
