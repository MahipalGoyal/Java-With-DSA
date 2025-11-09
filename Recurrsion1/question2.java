public class question2 {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    public static void printNumber(int n) {
        if(n == 0) {
            return;
        }

        int lastDigit = n%10;
        printNumber(n/10);
        System.out.print(digits[lastDigit]+" ");
    }

    public static void main(String[] args) {
        printNumber(12064);
    }
}
