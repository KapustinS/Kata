package Test;

public class ReverseString {

    static String reverse(String st) {

        StringBuilder result = new StringBuilder();

        for (int i = st.length() - 1; i >= 0; i--) {
            result.append(st.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Hello World!";
        System.out.println(reverse(s));
    }
}
