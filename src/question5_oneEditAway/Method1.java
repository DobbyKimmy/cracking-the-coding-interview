package question5_oneEditAway;

import java.util.Arrays;


public class Method1 {
    public boolean oneEditAway(String first, String second) {

        int firstLen = first.length();
        int secondLen = second.length();
        if (firstLen == 0 && secondLen == 0) {
            return true;
        }
        int abs = Math.abs(firstLen - secondLen);
        if (abs > 1) {
            return false;
        }
        // insert or delete
        if (abs == 1) {
            return insertOrDelete(first, second);
        }
        // replace or equals
        else {
            return replaceOrEquals(first, second);
        }
    }

    private static boolean insertOrDelete(String first, String second) {
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        int lenOfFirst = firstChars.length;
        int lenOfSecond = secondChars.length;
        if (lenOfFirst == 0 || lenOfSecond == 0) {
            return true;
        }
        if (lenOfFirst > lenOfSecond) {
            int i = 0; // first
            int j = 0; // second
            while (j < lenOfSecond && firstChars[i] == secondChars[j]) {
                i++;
                j++;
            }
            i++;
            for (; j < lenOfSecond; j++, i++) {
                if (firstChars[i] != secondChars[j]) {
                    return false;
                }
            }
            return true;
        } else {
            // lenOfFirst < lenOfSecond
            int i = 0; // first
            int j = 0; // second
            while (i < lenOfFirst && firstChars[i] == secondChars[j]) {
                i++;
                j++;
            }
            j++;
            for (; i < lenOfFirst; j++, i++) {
                if (firstChars[i] != secondChars[j]) {
                    return false;
                }
            }
            return true;
        }
    }

    private static boolean replaceOrEquals(String first, String second) {
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        if (Arrays.equals(firstChars, secondChars)) {
            return true;
        }
        int differ = 0;
        for (int i = 0; i < firstChars.length; i++) {
            if (firstChars[i] != secondChars[i]) {
                differ++;
            }
        }
        return differ == 1;
    }
}
