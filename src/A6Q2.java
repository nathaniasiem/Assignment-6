
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create Scanner to scan input
        Scanner input = new Scanner(System.in);

        //ask user to input number of people
        System.out.println("How many people are there?");

        //take user input and store in variable
        //use this to create array
        int people = input.nextInt();

        //create a list of people's heights
        int [] height = new int[people];

        //ask user to enter the height
        System.out.println("Enter the height of the people in centimeters.");
        
        //scan in some of the people's height
        //use this to calculate sum of all height
        for (int i = 0; i < height.length; i++) {
            height[i]=input.nextInt();
        }
        
        //determine the sum of all height
        //use this to calculate the average
        //create an accumulator
        double sum = 0;
        //go through each number
        for(int i = 0; i<height.length;i++){
            //add each number on the list according to the current sum
            sum = sum +height[i];           
        }
        //calculate the average
        //use this to compare to the heights
        double avg = sum/height.length;
        avg = Math.ceil(avg);
        
        //compare the heights 
        
                
        }
    }
