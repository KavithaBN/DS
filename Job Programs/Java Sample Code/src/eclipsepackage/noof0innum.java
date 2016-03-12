package eclipsepackage;

import java.util.*;

public class noof0innum{
public static void main(String[] args) {
	
	System.out.println("the number of 0 is"+ num(1001));
	
	
}
	
	public static int num (int num) 
	{
		 int i, count = 0;
	    for( i = 0; i < 32 ; i++)
	    {
	        if (num % 2 == 0)
	        {
	            count++;
	        }
	        num = num >> 1;
	    }
	    return count;
}
}