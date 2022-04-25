import java.util.*;
/*
 * SmallestInt.java
 */

/**
 *
 * @author Andy Kilgore
 */


class SmallestInt {
    //start main method
    public static void main(String[] args) {
		 //Init scanner object and vars 
    	 Scanner s = new Scanner(System.in);
         int minnum = 0;
         int loops = 0;
      //Start do while loop to trigger user input repeat until valid int is entered.
    	 do {
        	System.out.print("How many integers shall we compare? (Enter a positive integer): ");
        	loops = s.nextInt();
        	if (loops <= 0){
        	    System.out.println("Invalid input!");
        	}
    	    }
       while (loops <= 0);
           //Start for loop, user enters value and minnum is assigned ,if current is less than minnum, it is updated.
        int current = 0;
        for(int count = 1; count <= loops ; ++count ) {
         System.out.print("Enter value " + count + ": ");
         current = s.nextInt();
         //first time around assign the min value to something useful, only executes first time.
         if (count == 1) {
           minnum = current;
              }
         if (current <= minnum){
           minnum = current;
            	}
        }
        //loop finished and display the smallest number. 
        System.out.println("The smallest number entered was: " + minnum);        
    }
}
