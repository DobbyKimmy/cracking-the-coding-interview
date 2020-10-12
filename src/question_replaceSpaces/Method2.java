package question_replaceSpaces;

public class Method2 {
    // StringBuilder
    public String replaceSpaces(String S, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == ' ') {
                sb.append("%20");
                continue;
            } else {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}
