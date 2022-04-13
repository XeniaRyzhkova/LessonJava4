import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private final HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phoneBook.put(lastName, phonesForLastName);
    }

    public ArrayList<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "445555667");
        phoneBook.add("Petrov", "5675445");
        phoneBook.add("Sidorov", "7898765");
        phoneBook.add("Sidorov", "2345678");

        System.out.println(phoneBook.get("Petrov"));
    }

    private static class PhoneBook {
        public void add(String petrov, String s) {
        }

        public boolean get(String petrov) {
            return false;
        }
    }
}

