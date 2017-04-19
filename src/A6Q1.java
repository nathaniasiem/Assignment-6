
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to scan in input
        Scanner input = new Scanner(System.in);

        //ask user to enter the number of students
        System.out.println("How many students in the class?");

        //scan input into variable
        int student = input.nextInt();

        //create a list of marks
        int[] marks = new int[student];

        //scan in some marks
        System.out.println("Please enter the students' marks.");

        //take input of marks and put into variable
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

        //calculate the sum of the marks to use for calculating the class average
        //create an accumulator
        double sum = 0;
        //go through each number
        for (int i = 0; i < marks.length; i++) {
            //take input and add on to the current sum
            sum = sum + marks[i];
        }
        System.out.println("The sum is " + sum + ".");

        //calculate the average
        double avg = sum / marks.length;
        avg = Math.round(avg * 100) / 100.0;
        System.out.println("The class average is " + avg + "%.");
    }
}
