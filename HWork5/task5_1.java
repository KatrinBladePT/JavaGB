import java.util.*;

public class task5_1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        addPhoneNumber(phoneBook, "John Doe", "1234567890");
        addPhoneNumber(phoneBook, "Jane Smith", "9876543210");
        addPhoneNumber(phoneBook, "John Doe", "5555555555");
        addPhoneNumber(phoneBook, "Jane Smith", "1111111111");
        addPhoneNumber(phoneBook, "John Doe", "9999999999");

        printPhoneBook(phoneBook);
    }

    public static void addPhoneNumber(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(name, numbers);
    }

    public static void printPhoneBook(Map<String, List<String>> phoneBook) {
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());

        entries.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : entries) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            
            System.out.println(name + ": " + numbers);
        }
    }
    
}
