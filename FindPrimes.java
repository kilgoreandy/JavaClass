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
    int i = 2;
    boolean prime = true;
    while (i <= num / 2) {
      // condition for nonprime number
      if (num % i == 0) {
        prime = false;
        break;
      }

      ++i;
    }
    return prime;
     
  }
}