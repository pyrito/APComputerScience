/**
 * @(#)UILProblem.java
 *
 *
 * @author 
 * @version 1.00 2017/1/24
 */

public class UILProblem {
        
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(gcd(64,24));
        System.out.println(lcm(64,24));
    }
    
    static long gcd(long a, long b){
    	while(b > 0){
    		long temp = b;
    		b = a % b;
    		a = temp;
    	}
    	return a;
    }
    
    static long lcm(long a, long b){
    	return (a*b) / (gcd(a,b));
    }
}
