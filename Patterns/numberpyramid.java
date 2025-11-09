import java.util.*;

public class numberpyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int number = 1; number<=i; number++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
