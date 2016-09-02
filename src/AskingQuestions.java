import java.util.Scanner;

public class AskingQuestions 
{ 
  public static void main( String[] args ) 
  { 
    Scanner keyboard = new Scanner(System.in);

    int num1, num2, num3;

    System.out.print( "First integer? " );
    num1 = keyboard.nextInt();

    System.out.print( "Second integer? " );
    num2 = keyboard.nextInt();

    System.out.print( "Third integer? " );
    num3 = keyboard.nextInt();
    
    System.out.printf("The total is : %d",(num1+num2+num3));
  }
  
}