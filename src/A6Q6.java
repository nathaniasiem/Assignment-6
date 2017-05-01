
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan input
        Scanner input = new Scanner(System.in);

        //ask user input the size of the class
        System.out.println("Enter the number of students in the class: ");
        int students = input.nextInt();

        //create a list of marks
        int[] marks = new int[students];

        //ask user to input the list of marks
        System.out.println("Enter the " + students + " students' marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        
        //clear the space
        for(int i=0;i<marks.length;i++){
            System.out.println("\n");
        }
        
        //find the lowest mark out of the group
        //find the highest mark out of the group
        //set variables to compare marks within array
        int min = marks[0];
        int max = marks[0];
        //go through each mark
        for (int i = 0; i < marks.length; i++) {
            //condition when mark is larger
            if (marks[i] > max) {
                max = marks[i];
                //condition when mark is lower
            } else if (marks[i] < min) {
                min = marks[i];
            }
        }
        //print out lowest and highest mark
        System.out.println("The highest mark is: " + max);
        System.out.println("The lowest mark is: " + min);
          
        //calculate the sum of all marks
        //use this to calculate the average
        int sum=0;
        for (int i =0;i<marks.length;i++){
        sum=sum+marks[i];
    }
        //calculate the average value
        double average=sum/marks.length;
        System.out.println("The average mark in the class is: " +average+".");
    }
}
