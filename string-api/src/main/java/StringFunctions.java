public class StringFunctions {

    public static String reverseString(String s){
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(s);
        reversedString.reverse();
        return String.valueOf(reversedString);
    }

    public static int sizeofString(String s){
        return s.length();
    }
}


