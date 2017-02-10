/**
 * @(#)ArrayPractice.java
 *
 *
 * @author 
 * @version 1.00 2016/11/8
 */
import java.util.Arrays;

public class ArrayPractice {
        
    /**
     * Creates a new instance of <code>ArrayPractice</code>.
     */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1,2,6};
    	if(array[0] == 6 || array[array.length - 1] == 6){
    		System.out.println("true"); 
    	}
    	else{
    		System.out.println("false");
    	}
    
}
}
