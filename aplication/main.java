package aplication;
import java.util.Scanner;

public class main{

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try {
    System.out.println("Enter names separeted by space: ");
    String[] vect = sc.nextLine().split(" ");
    System.out.println("Enter a position for the program to return the name that is on it: ");
    int position = sc.nextInt();
    System.out.println("Name in the position " + position + ": " + vect[position]);
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid position!");
    }

    System.out.println("\nEnd of program!");

    sc.close();

    }
}