import java.util.*;

public class StringPermutations {
    public static void main(String[] args) {
        String s = "ABC";
        List<String> result = permute(s);
        System.out.println(result);
    }

    public static List<String> permute(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, "", result, new boolean[s.length()]);
        return result;
    }

    private static void backtrack(String s, String temp, List<String> result, boolean[] used) {
        if (temp.length() == s.length()) {
            result.add(temp); // Found a permutation
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (used[i]) continue; // Skip already used characters
            used[i] = true;
            backtrack(s, temp + s.charAt(i), result, used);
            used[i] = false; // Backtrack
        }
    }
}
