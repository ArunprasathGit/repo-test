import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeat {
    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (countMap.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String input = "aabccdeff";
        char result = firstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First excuse non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
