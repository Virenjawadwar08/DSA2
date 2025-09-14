import java.util.ArrayList;
import java.util.List;

public class leet17 {
    // 17. Letter Combinations of a Phone Number

//     Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

// A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return ans;
        return padRet("", digits);
    }

    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        // skip 0 and 1 (no letters)
        if (digit == 0 || digit == 1) {
            return padRet(p, up.substring(1));
        }

        int start = (digit - 2) * 3;

if (digit > 7) start += 1;

int end = start + (digit == 7 || digit == 9 ? 4 : 3);

for (int i = start; i < end; i++) {
    char ch = (char) ('a' + i);

    list.addAll(padRet(p + ch, up.substring(1)));


        }

        return list;
    }

}
