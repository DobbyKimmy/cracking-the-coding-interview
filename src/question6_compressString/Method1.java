package question6_compressString;

public class Method1 {
    public String compressString(String S) {
        if (S.length() == 0) {
            return S;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = S.toCharArray();
        char ch = chars[0];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                count++;
                if (i == chars.length - 1) {
                    sb.append(ch);
                    sb.append(count);
                }
            } else {
                sb.append(ch);
                sb.append(count);
                ch = chars[i];
                count = 1;
                if (i == chars.length - 1) {
                    sb.append(ch);
                    sb.append(count);
                }
            }
        }
        return chars.length <= sb.length() ? S : sb.toString();
    }
}
