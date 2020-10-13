package question4_canPermutePalindrome;

public class Method2 {
    public boolean canPermutePalindrome(String s) {
        int[] allChars = new int[128];
        for (int i = 0; i < s.length(); i++) {
            allChars[s.charAt(i)]++;
        }
        boolean isEven = s.length() % 2 == 0;
        int oddCount = 0;
        for (int i = 0; i < 128; i++) {
            if (isEven) {
                if (allChars[i] % 2 != 0) {
                    return false;
                }
            } else {
                if (allChars[i] % 2 != 0) {
                    if (++oddCount > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
