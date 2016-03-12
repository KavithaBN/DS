package eclipsepackage;

import java.util.*;
public class postfixeval{
	
	public static void main(String args[]){
		System.out.println("enter the input string");
		
	
	}

public static int evalPf(String str)
{
    Scanner sc = new Scanner(str);
    Stack<Integer> stack = new Stack<Integer>();

    while (sc.hasNext()) {
        if (sc.hasNextInt()) {
            stack.push(sc.nextInt());
            continue;
        }
        int b = stack.pop();
        int a = stack.pop();
        char op = sc.next().charAt(0);
        if      (op == '+') stack.push(a + b);
        else if (op == '-') stack.push(a - b);
        else if (op == '*') stack.push(a * b);
        else if (op == '/') stack.push(a / b);
        else if (op == '%') stack.push(a % b);
    }

    sc.close();
    return stack.pop();
}
}