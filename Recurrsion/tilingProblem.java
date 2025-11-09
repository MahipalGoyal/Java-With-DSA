/*public class tilingProblem {
    public static int TilingProblem(int n) { //2xn is floor size
        //base case
        if(n==0 || n==1) {
            return 1;
        }
        return TilingProblem(n - 1) + TilingProblem(n - 2);
        //kaam
        //vertical choice
     //   int fnm1 = tilingProblem(n-1);

        //horizontal choice
       // int fnm2 = tilingProblem(n-2);

        //int totWays = fnm1 + fnm2;
        //return totWays;
    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(6));
    }
}*/


public class tilingProgram {
    public static int TilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return TilingProblem(n - 1) + TilingProblem(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(TilingProblem(6));
    }
}
