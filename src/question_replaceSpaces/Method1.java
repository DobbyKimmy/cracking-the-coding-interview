package question_replaceSpaces;

public class Method1 {
    // API
    public String replaceSpaces(String S, int length) {
        return S.substring(0, length).replaceAll(" ", "%20");
    }
}
