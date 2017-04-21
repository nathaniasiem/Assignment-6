
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan in input
        Scanner input = new Scanner(System.in);

        //create a list of integers
        int[] marks = new int[10];

        //initiate user to enter marks
        System.out.println("Enter 10 students' marks: ");

        //scan input into variable
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

    }
}
