public class looping1 {
        public static void main(String[] args) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print((j % 2) * (int) Math.pow(-1, i) + " ");
                }
                System.out.println();
            }
        }
    }
    
