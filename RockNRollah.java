/*
 * RockNRollah.java
 */

import java.util.Random;

/**
 *
 * @author Andy kilgore
 */
public class RockNRollah {
    public static void main(String[] args) {
    	// Create a Random object
    	// Initialize a couple of variables to hold the values of the two dice
		int dice1;
    	int dice2;
		int count = 0;
		int sum = 0;

    	// Initialize the array that will hold the results
		 int[] results = {0,0,0,0,0,0,0,0,0,0,0};
    	/* Hypothetical questions: (no, I don't want answers)
    	 *   How many different sum values do we need to account for?
    	 *   How big does the array need to be?
    	 *   Why might you make it (slightly) larger? (Note: my answer does not use an unnecessarily large array, and I'm not encouraging you to; just giving you something to think about) 
    	 */

    	// Roll the dice (a lot) and sum and tally the results
		while (count < 100001){
			dice1=(int)(Math.random()*6+1);
    	    dice2=(int)(Math.random()*6+1);
			sum = dice1 + dice2;

			switch (sum){
				case 2:
				    ++results[0];
				    break;
				case 3:
				    ++results[1];
				    break;
				case 4:
				    ++results[2];
				    break;
				case 5:
				    ++results[3];
				    break;
				case 6:
				    ++results[4];
				    break;
				case 7:
				    ++results[5];
				    break;
				case 8:
				    ++results[6];
				    break;
				case 9:
				    ++results[7];
				    break;
				case 10:
				    ++results[8];
				    break;
				case 11:
				    ++results[9];
				    break;
				case 12:
				    ++results[10];
				    break;
				default:
				    System.out.println("nope");
				    break;
				

			}
			System.out.println(count);
			++count;
		}
        // Display the frequencies
        System.out.println("Results after " + count + " rolls");
        System.out.println("-------------------------");
        System.out.println("Value\tFrequency");
        for(int i = 2, j = 0; i < 11; ++i, ++j){
        System.out.println(i + "   " + results[j]);
        // Loop, displaying the rows for the body of the table, each on its own line.
        //   The required format for each row is to display the sum, followed by a tab, followed by the number of times that sum came up. Do not include any additional formatting
    }
    }
}