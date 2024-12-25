package week10;

public class minggu10 {
    
    public static void main(String[] args) {
        int[] array = {
            5,3,2,4,1
        };
        int n = array.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0;j < n - 1; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int value : array){
            System.out.print(value);
        }
        }
     }
   

