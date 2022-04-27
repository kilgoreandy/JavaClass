/*
 * FindPrimes.java
 */

/**
 *
 * @author Andy Kilgore
 */
public class FindPrimes {
    static int count = 2;
       
    public static void main(String[] args) {
        System.out.println("Prime numbers < 10k:");
        /* Loop 10000 times, checking every number along the way for primeness...
         * Let the isPrime method do the heavy lifting
         * If a given number is prime it should be displayed on its own line (non prime numbers are not displayed at all)
         */
         while (count < 10001){
             if (isPrime(count)){
                 System.out.println(count);
                 count++;
             }
             else {
                 count++;
             }

             }
    }
    
    public static boolean isPrime(int num) {
    	/* There is more than one way to determine if a number is prime or not...
    	 * We'll take the "easy way out" and verify by brute force that a number is evenly divisible only by 1 and itself:
         * this method will return true if so (it is prime!) and false otherwise (it is not prime)
         * You are NOT being asked to implement the Sieve of Eratosthenes algorithm
         * You MUST use an iterative/loop (no big if-else or switch statements)
         *
         * Note: negative numbers aren't prime. isPrime should return false if provided a negative number as its argument
         */         
        
        /* Part C has you writing and running the program with upper limits of n/2 and the square root of n.
         * Only very minimal (as little as a single line) changes are necessary to use one upper limit in place of another.
         * SUBMIT YOUR SOLUTION USING THE SQUARE ROOT OF N AS THE UPPER LIMIT. 
         * 
         * This exercise shows that you can solve the same problem with 
         * different algorithms... the key takeaway is that, just because one 
         * approach works doesn't mean it is the best.
         *
         * Why are we able to limit our search for even divisors to those numbers less than or equal to the square root?
         * All of the numbers > the square root must be 
         * multiplied by a number < the square root to equal the target 
         * number... so why not just check the numbers <= the square root
         */        
         int counter = 0;
         double max; 
         boolean prime = false;
         if (num < 0){
             prime = false;
         }
        max = java.lang.Math.sqrt(num);
        while (counter <= max){
            if (counter % num == 0 ){
                prime =  false;
                }
            else {
                counter++;
                prime = true;
                }

         }
         return prime;
    }
}
