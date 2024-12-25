package week12;

public class reksrusif {
    public static int faktorial(int n) {
        if (n == 1){
            System.out.print(" 1");
            return 1;
        } 
            System.out.print(n + " X ");
            return n * faktorial(n - 1);
        }
        
    public static void main(String[] args) {
        int n = 5;
        System.out.print(n+"!= ");
        int result = faktorial(n);
        System.out.print("="+result);
    }
}
