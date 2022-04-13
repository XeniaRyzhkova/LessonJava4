import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] name = {"Kata", "Misha", "Lena", "Kata", "Lena", "Petia", "Lena", "Misha", "Lena", "Petia", "Katia"};
        HashMap<String, Integer> uniqueword = new HashMap<>();
        for (String a : name) {
            uniqueword.put(a, uniqueword.getOrDefault(a, 0) + 1);
        }
        System.out.println(uniqueword);
    }
}

