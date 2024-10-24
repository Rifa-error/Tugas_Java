package week4.latihan;

public class segitigabintang {
        public static void main(String[] args) {
                    for (int i = 0; i < 4; i++) {
                        if (i % 2 == 0) {  // Baris genap: cetak bintang
                            for (int j = 0; j <= i / 2; j++) {
                                System.out.print("* ");
                            }
                        } else {  // Baris ganjil: cetak angka
                            for (int j = 0; j <= i; j++) {
                                System.out.print(j + " ");
                            }
                        }
                        System.out.println();
                    }
                }
            }
            
    
