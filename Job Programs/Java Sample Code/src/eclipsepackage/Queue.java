
package eclipsepackage;

import java.util.*; 

public class Queue {

	public static void main(String[] args) {
		Queue type = new Queue();
		boolean exit123 = false, stats;
		int opt;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hi!! Welcome...");
		
		while(!exit123) {
			
			System.out.println("Please enter your selection: 1. Enter the name, 2. Pull the Element , 3. List the content 4. Exit/End");
			opt = in.nextInt();
			
			switch (opt) {
				case 1: 
					System.out.println("File Name: ");
					StringBuilder strgTemp = new StringBuilder();
					strgTemp.append(in.next());
					stats = type.offer(strgTemp.toString());
					if (stats)
						System.out.println(strgTemp +" is the name");
					else
						System.out.println("Size Exceeded");
					strgTemp = null;
					break;
				
				case 2:
					if (!string.isEmpty())
						System.out.println("Removed: " +type.poll());
					else
						System.out.println("Queue is empty");
					break;
					
				case 3:
					if (!string.isEmpty())
						System.out.println(type.toString().replaceAll("\\[", "").replaceAll("]", ""));
					else
						System.out.println("Queue is empty");
					break;

				
				case 4:
					System.out.println("Thank you!");
					exit123 = true;
					break;
				
				default:
					System.out.println("The entered value is incorrect");
			}
		}
		in.close();
	}

	
}

