package class1;


import java.util.Scanner;

/*
    Name:  Purvesh Dave
    Assignment:  [assignment name]
    Program: Computer Programming
    Date:  [assignment due date here]

    Description:
    [program description in your own words]
*
s

package class1;

/**
 *
 * @author purve
 */
public class Class1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Input String");
        
        char[] charInput = scn.nextLine().toCharArray();
        
        for (int i = charInput.length -1; i >= 0; i--) {
            System.out.println(charInput[i]);
        }

    }

}
