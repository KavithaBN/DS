package eclipsepackage;

import java.util.*;

public class uniquecharinstring {
public static void main(String[] args)
{
System.out.println("Enter the imput string\n");
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();

}

	public static boolean uniquecharinstring(String str){
		
		 boolean[] char_set = new boolean[256];
		for (int i=0; i<str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val])
				return false;
			char_set[val]= true;
		
	}return true;
}}