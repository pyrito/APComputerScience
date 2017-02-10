/**
 * @(#)aditjainvlogs.java
 *
 *
 * @author 
 * @version 1.00 2017/1/24
 */
// guess who i met today 
public class aditjainvlogs {
        
    /**
     * Creates a new instance of <code>aditjainvlogs</code>.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
     int j;
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                   if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred  
                  } 
            } 
      } 
} 
    }
}
