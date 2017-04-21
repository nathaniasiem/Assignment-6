
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan in input
        Scanner input = new Scanner(System.in);

        //create list of numbers
        int[] integers = new int[2];

        //ask user to input 2 numbers
        System.out.println("Enter 2 integers: ");

        //scan input into variable
        for (int i = 0; i < integers.length; i++) {
            integers[i] = input.nextInt();
        }
        
        //condition to compare numbers of which is larger in order to swap positions
        if (integers[0] > integers[1]) {
            int temp = integers[0];
            integers[0] = integers[1];
            integers[1] = temp;
        }
        
        //print out numbers in ascending order
        System.out.println("The integers in acscending order are: ");
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }
}
