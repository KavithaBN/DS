
package eclipsepackage;

import java.util.Scanner;

public class roman {

public static void main(String[] args) {
      int r = Integer.parseInt(args[0]);
      System.out.println(trans(r));
   }

 static String trans(int r){
      String[] s = 
         {"M","CM","D","CD","C","XC",
          "L","XL","X","IX","V","IV","I"};
      int[] u = 
         {1000, 900, 500, 400, 100, 90,
            50, 40, 10, 9, 5, 4, 1};
      String t = "";
      for (int i = 0; i < 13; i++)
         while (r >= u[i]) {
            t += s[i];
            r -= u[i];
         }
      return t;
   }
}