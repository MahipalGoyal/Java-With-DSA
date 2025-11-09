public class question3 {
    public static int lengthofString(String str) {
        if(String.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
    public static void main(String [] args) {
        String str = "abcde";
        System.out.println(length(str));
    }
}
