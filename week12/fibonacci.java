package week12;

public class fibonacci {
    public static void fibonacciX(int n, int a, int b) {
        if (n== 0) {
            return;
        } else{
            System.out.print(a+" ");
            fibonacciX(n-1, a, a+b);
        }
        
    }
    public static void main(String[] args) {
        int n = 10;
        int a = 1;
        int b = 1;
        fibonacciX(n, a, b);
    }
}
