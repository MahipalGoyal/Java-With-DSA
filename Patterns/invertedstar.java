import java.util.*;

public class invertedstar {
    public static void main(String[] args) {
        
        for (int i = 1; i<=50; i++) {
            for (int star=1; star<=50-i+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
