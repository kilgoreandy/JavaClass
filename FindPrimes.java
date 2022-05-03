/*
 * FindPrimes.java
 */

/**
 *
 * @author Andy Kilgore
 */
public class FindPrimes {
    //Started at 0 just for giggles. 
    static int count = 0;
    public static void main(String[] args) {
        System.out.println("Prime numbers < 10k:");
        //while loop counts  until 10001
         while (count < 10001){
             //Call to isPrime function for each number
             if (isPrime(count)){
                 //Print if true and increment 
                 System.out.println(count);
                 count++;
             }
             else {
                 //Increment regardless
                 count++;
             }
             }
    }
     
    public static boolean isPrime(int num) {
// We do not really care about any num that is less than 2 so we hardcode to return prime false. 
        boolean prime = false;
    	if(num < 2) 
            return prime;
        
       //starting with 2 we determine if its divisible evenly if not then its def prime. 
        for(int i=2; i <= Math.sqrt(num); i++) {
        	
            if(num % i == 0)
                return prime;
        }
        
        // Anything else has to be prime so we return prime = true back to the main function. 
        prime = true;
        return prime;
    }
}