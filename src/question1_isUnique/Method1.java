package question1_isUnique;

import java.util.HashSet;
import java.util.Set;

public class Method1 {
    // 使用Hash
    public boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (set.contains(chars[i])) {
                return false;
            } else {
                set.add(chars[i]);
            }
        }
        return true;
    }
}
