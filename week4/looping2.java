package week4;

public class looping2 {
    public static void main(String[] args) {

        int a = 24;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j+=1){
                System.out.print(a + " ");
                a -= 1; 
            }
            System.out.println();
        }
        
    }
    
}


