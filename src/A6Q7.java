
import java.util.Scanner;

/**
 *
 * @author candy
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan input
        Scanner input = new Scanner(System.in);

        // ask user to input the maximum number in a set of numbers
        System.out.println("Enter the maximum number:");
        int n = input.nextInt();

        // create a list of numbers to determine prime numbers
        //set variable to mark when true denotes prime number 
        //assumes all numbers within the set are prime numbers
        boolean[] isPrime = new boolean[n];
        isPrime[0] = false;
        for (int i = 1; i < n; i++) {
            isPrime[i] = true;
        }

        
        System.out.println("The prime numbers below " + n + " are: ");
        //goes through each number in the set for prime numbers
        for (int i = 2; i <= n; i++) {
            //it is a prime number, when it is not marked 
            if (isPrime[i - 1]) {
                //print out the prime number
                System.out.println(i);
            }
            //marks all of the numbers that are not prime
            for (int j = i * i; j <= n; j += i) {
                isPrime[j - 1] = false;
            }
        }
    }
}
