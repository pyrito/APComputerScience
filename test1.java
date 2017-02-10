/**
 * @(#)test1.java
 *
 *
 * @author 
 * @version 1.00 2017/1/24
 */
import java.util.*;
import java.io.*;

public class test1 {
        
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner in = new Scanner(new File("diamonds.dat"));
        int count = in.nextInt();
        in.nextLine();
        /*for(int i = 0; i < count; i++){
        	String letter = in.nextLine();
        	letter = letter.substring(0, letter.indexOf(" "));
        	
        }*/
 /*       TreeMap <String, String> tree = new TreeMap<String, String>();
		tree.put("param21", "value1");
		tree.put("param2", "value2");
	for (Map.Entry <String, String> entry: tree.entrySet()) {
    	String key = entry.getKey();
    	String value = entry.getValue();
    	System.out.printf("%s : %s\n", key, value);
		}			*/
		 for (int i = 1; i < 10; i += 2) {
      for (int j = 0; j < 9 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }

    for (int i = 7; i > 0; i -= 2) {
      for (int j = 0; j < 9 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }
  }
		/*TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		tree.put(10, "Superman");
		tree.put(15, "Batman");
		tree.put(0, "Karthik");
		tree.put(7, "Spiderman");
		tree.put(17, "Wonder Woman");
		for(Map.Entry<Integer, String> entry: tree.entrySet())
			System.out.println(entry.getValue() + " saved " + entry.getKey() + " people");*/
		
    
}
