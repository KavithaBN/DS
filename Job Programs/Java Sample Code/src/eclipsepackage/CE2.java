package eclipsepackage;

import java.util.*;

public class CE2 {
	 
static int solution (String S) {

char[] tokens = S.toCharArray();

 Stack<Integer> values = new Stack<Integer>();

	 for (int i = 0; i < tokens.length; i++)

	        { if (tokens[i] == ' ')

                continue;

    if (tokens[i] >= '0' && tokens[i] <= '9')

            {

	                values.push(Integer.parseInt(tokens[i]+""));

	            }

  else if (tokens[i] == '+' || tokens[i] == '*' )

	            {

	            try{

	                int intermediateResult=applyOp(tokens[i], values.pop(), values.pop());

               

	                if(intermediateResult <= 4095)

                values.push(intermediateResult);

            else

                return -1;

	           	   

	            }catch(EmptyStackException e){

	            return -1 ;

            }

	            }

	        }

	       

	        if(values.isEmpty())

	            return -1;

	           

	        return values.pop();

	    }

	 

	public static int applyOp(char op, int b, int a)

	    {

	        switch (op)

	        {

	        case '+':

	            return a + b;

	        case '-':

	            return a - b;

	        case '*':

	            return a * b;

	        case '/':

	            if (b == 0)

	                throw new

	                UnsupportedOperationException("Cannot divide by zero");

	            return a / b;

	        }

	        return 0;

    }

}