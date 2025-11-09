import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float item1 = sc.nextFloat();
        float item2 = sc.nextFloat();
        float item3 = sc.nextFloat();
        float sum = item1 + item2 + item3;
        float gst = sum * 0.18f;
        float total= gst + sum;

        System.out.println("Total Bill is - " +total);


    }
}
