import java.util.*;

public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a number");
        
        do {
            int a = sc.nextInt();
            if(a % 10 == 0) {
                break;
            }
            System.out.println(a);
        } while(true);
        
  
    }
    
}
