public class binomial {
    public static int factorial(int n) {
        int f = 1;

        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f; //factorial of n
    }
    public static int bincoeff(int n, int r){
      int n_fact = factorial(n);
      int r_fact = factorial(r);
      int n_rfact = factorial(n-r);
      int bincoeff = n_fact / (r_fact * n_rfact);
      return bincoeff;

    }
    public static void main(String[] args) {
        System.out.println(bincoeff(5, 2));
    }
}
