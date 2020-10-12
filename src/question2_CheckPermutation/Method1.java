package question2_CheckPermutation;

import java.util.Arrays;

public class Method1 {
    public boolean CheckPermutation(String s1, String s2) {
        // 思路一：对两个字符串的字符排序
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        if (chars1.length != chars2.length) {
            return false;
        }
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }
}
