import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Map<Character, Integer> dict1 = new HashMap<>();
        Map<Character, Integer> dict2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            dict1.put(c, dict1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            dict2.put(c, dict2.getOrDefault(c, 0) + 1);
        }
        return dict1.equals(dict2);
    }

    public static void main(String[] args) {
        boolean flag = isAnagram("listen", "silent");
        System.out.println(flag);
    }
}
