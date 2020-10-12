package question1_isUnique;

public class Method2 {
    // 位运算
    public boolean isUnique(String astr) {
        long high = 0;
        long low = 0;
        for (char c : astr.toCharArray()) {
            if (c >= 64) {
                long bitIndex = 1L << (c - 64);
                if ((high & bitIndex) != 0) {
                    return false;
                }
                high |= bitIndex;
            } else {
                long bitIndex = 1L << c;
                if ((low & bitIndex) != 0) {
                    return false;
                }
                low |= bitIndex;
            }
        }
        return true;
    }
}
