package question4_canPermutePalindrome;

import java.util.HashSet;
import java.util.Set;

public class Method1 {
    public boolean canPermutePalindrome(String s) {
        char[] chars = s.toCharArray();
        // hashset
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if(set.contains(chars[i])){
                set.remove(chars[i]);
            }else{
                set.add(chars[i]);
            }
        }
        return set.size() == 1 || set.size() == 0;
    }
}
