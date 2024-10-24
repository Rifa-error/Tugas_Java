package week4.latihan;

public class majumundur {
        public static void main(String[] args) {
            int rows = 4;
            int cols = 5;
            for (int i = 1; i <= rows; i++) {
                if (i % 2 == 1) {  // Baris ganjil (maju)
                    for (int j = 1; j <= cols; j++) {
                        System.out.print(((i - 1) * cols + j) + " ");
                    }
                } else {  // Baris genap (mundur)
                    for (int j = cols; j >= 1; j--) {
                        System.out.print(((i - 1) * cols + j) + " ");
                    }
                }
                System.out.println();
            }
        }
    }
    
