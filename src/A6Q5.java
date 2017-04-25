
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A6Q5 {

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
        
        //ask user how many marks they want to sort 
        System.out.println("Enter the amount of marks you want to sort:");
        int numMark = input.nextInt();
        
        
        
        //sort numbers in ascending order
        //goes through each number
        for (int i = 0; i < marks.length - 1; i++) {
            //compare each value, lowest mark moves up through the sort order
            for (int j = i + 1; j < marks.length; j++) {
                //condition if the mark that's in the next index is less than the current mark
                if (marks[i] > marks[j]) {
                    //set temporary variable to hold smaller number when switching positions
                    int temp = marks[j];
                    marks[j] = marks[i];
                    marks[i] = temp;
                }
            }
        }
        //clear space
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
        }
        
        //print out marks in ascending order
        System.out.println("Your marks in ascending order are: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
