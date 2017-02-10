/**
 * @(#)LoopTest.java
 *
 *
 * @author 
 * @version 1.00 2016/11/15
 */

public class LoopTest {
        
    /**
     * Creates a new instance of <code>LoopTest</code>.
     */
    public LoopTest() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   	/*	String name = "Karthik";
   		int i = 0;
   		while(i < name.length())
   		{
   			System.out.println(name.charAt(i));
   			i++;
   		}   
   		
   		int sum = 0;
   		for(int i = 0; i >= -10; i-= 2){
   			sum += i; 
   			System.out.println("for i:" + i + " the sum is now " + sum);
   		}*/
   		
   		int sum = 0;
   		for( char a = 'a'; a <= 'z'; a++){
   			System.out.println("a: " + a);
   			for( char A = 'A'; A <= 'Z'; A++){
   				System.out.println("A: " + A);
   			}
   		}
    }
}
