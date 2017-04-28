
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
        
        //
    }
}
