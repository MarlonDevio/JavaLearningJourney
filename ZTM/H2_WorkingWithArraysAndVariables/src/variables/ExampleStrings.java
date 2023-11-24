package variables;

public class ExampleStrings {
    public static void main(String[] args) {
        String s = "hi";
        String s1 = "hello";
        Boolean same = s.equals(s1);
        System.out.println(s.toUpperCase());
        System.out.println(s);

        String subString = s1.substring(1,5);
        System.out.println(subString);

        boolean startsWith = s1.startsWith("h");
        int length = s1.length();
        System.out.println(length);
        char c = s1.charAt(2);
        System.out.println(length);
        System.out.println(c);

    }
}
