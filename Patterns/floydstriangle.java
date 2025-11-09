import java.util.*;

public class floydstriangle {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        for(int lines = 1; lines<=n; lines++) {
            for(int number=1; number<=lines; number++) {
                System.out.print(i);
                i++;
            }
            System.out.println();
        }
    }
    
}
