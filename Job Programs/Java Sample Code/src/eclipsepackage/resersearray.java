package eclipsepackage;

import java.util.*;

public class resersearray{
	public static void main(String args[]){
		int a[]={1,2,3,4,2,5};
	int	n=5;
		
		for(int i=0; i<n; i++){
			System.out.println("the given array is"+a[i]);
		
		}
		reverse(a);
		try{
			for(int i=0; i<n; i++)
			{
				System.out.println("the reversed array is"+ a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
		}
		
	}
	
	public static void reverse(int[] a)
	{
		
		for(int i=0; i<a.length/2; i++){
			int temp = a[i];
		    a[i] = a[a.length - i - 1];
		    a[a.length - i - 1] = temp;
			
			
		}
		
	}
	
}