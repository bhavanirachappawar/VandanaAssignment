import java.util.Arrays;
import java.util.Random;

public class ShuffleA {
	  public static void main(String[] args) {	      
	        int[] a1 = {1, 2, 3, 4, 5, 6, 7};	       
	        sa(a1);       
	        System.out.println("Shuffled array: " + Arrays.toString(a1));
	    }

	    public static void sa(int[] ar) {
	        int id, temp;
	        Random random = new Random();
	        for (int i = ar.length - 1; i > 0; i--) {
	            id = random.nextInt(i + 1);
	            temp = ar[id];
	            ar[id] = ar[i];
	            ar[i] = temp;
	        }
	    }

}
