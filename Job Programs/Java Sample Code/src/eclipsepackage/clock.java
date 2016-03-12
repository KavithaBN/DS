package eclipsepackage;

import java.util.*;

public class clock{
public static void main(String[] args) {
	
	System.out.println("angle at 3 o'clock"+ angle(3,60));
	System.out.println("angle at 6 o'clock"+ angle(6,60));
	System.out.println("angle at 3.15 o'clock"+ angle(3,15));
	
}
	
	public static double angle (int h,int m) 
	{
		if (h==12) h=0;
		if (m==60) m=0;
		double hr_angle = 0.5*(h*60+m);
		double min_angle =6*m;
		
		double agl = Math.abs(hr_angle-min_angle);
		agl = Math.min(360-agl,agl);
		return agl;
	}
}