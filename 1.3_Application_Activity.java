import java.util.Scanner;
public class InputOutput {public static void main(String[] args){
    System.out.print("Print first ");
    System.out.print("Print second ");//Using print statements
    
    System.out.println("Print third");
    System.out.println("Print fourth");
    System.out.println("Print fifth");//Using println statements
    
    Scanner input = new Scanner(System.in);//Create a scanner for inputs
    
    System.out.println("What is your favorite color?");
    String favColor = input.nextLine();
    System.out.println("You wrote: " + favColor);//Get the color and display it
    
    System.out.println("How many apples do you have?");
    int numApples = input.nextInt();
    System.out.println("You wrote: " + numApples);/*Get the num of apples and 
    display*/
    
    input.close();
}}//Close the scanner
