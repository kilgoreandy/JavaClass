/*
 * FindPrimes.java
 */

/**
 *
 * @author Andy Kilgore
 */
public class FindPrimes {
    //We dont care about multipying 1 because regardless that does not change anything so we start at 2. 
    static int count = 2;
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
        //We dont care about multipying 1 because regardless that does not change anything so we start at 2.
    int i = 2;
    boolean prime = true;
    while (i <= java.lang.Math.sqrt(num)) {
      // condition for nonprime number
      if (num % i == 0) {
          //if it can be divisible by i then it is not prime. Set prime to false if it can be. 
        prime = false;
        break;
      }
    //increment i counter
      ++i;
    }
    //return to callin method result of isPrime
    return prime;
     
  }
}