
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

        //ask user how many marks they want to sort 
        System.out.println("Enter the amount of marks you want to sort:");
        int numMark = input.nextInt();

        //create a list of integers
        int[] marks = new int[numMark];

        //initiate user to enter marks
        System.out.println("Enter " + numMark + " students' marks: ");

        //scan input into variable 
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

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
        
        //calculate the median
        //condition for odd or even number of marks
        if()
        // for Odd, divide the entire array by (number of slots) 
        //for Even, divide by 2, get the number before the middle number and add them both / 2
        // 6 numbers
        // 4 , 6 , 2 ,7 ,8, 1
        //  take 2 and 6, add them and divide by 2.
    }
}
