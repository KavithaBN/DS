package eclipsepackage;

import java.util.*;
import java.lang.StringBuilder;

public class stack {

	public static void main(String[] args) {
		boolean exit123 = false;
		int cat;
		Stack<String> newStack = new Stack<String>();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hi! Welcome....");
		
		while(!exit123) {
			
			System.out.println("Please choose options to be performed: 1. Enter new text, 2. Remove a item, 3. Diaplay list, 4. Exit/End");
			cat = in.nextInt();
			
			switch (cat) {
				case 1: 
					System.out.println("Enter new text: ");
					StringBuilder stringTemp = new StringBuilder();
					stringTemp.append(in.next());	
					stackPush(newStack, stringTemp.toString());
				
					break;
				
				case 2:
					stackPop(newStack);
					break;
				
				case 3:
					if (!newStack.empty())
						System.out.println(newStack.toString().replaceAll("\\[", "").replaceAll("]", ""));
					else
						System.out.println("list is empty");
					break;
				
				case 4:
					System.out.println("Good Day, Thanks!");
					exit123 = true;
					break;
				
				default:
					System.out.println("Entered Values are incorrect");
			}
		}
		in.close();
	}

	static void stackPush(Stack<String> string, String temp) {
		string.push(temp);
		System.out.println("Entered text is inserted in list");
	}
	
	static void stackPop(Stack<String> string) {
		if (!string.empty())
			System.out.println("The text entered is: " +string.pop());
		else
			System.out.println("Nothing to be removed");
	}
}

