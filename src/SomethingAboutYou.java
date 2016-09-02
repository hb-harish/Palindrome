import java.util.Scanner;

public class SomethingAboutYou { 
	
	public static void main( String[] args ) { 
	
	Scanner sc = new Scanner(System.in);

    String firstName;
    int age;
    String height;
    double gpa;

    System.out.print( "What is your first name? " );
    firstName = sc.next();

    System.out.print( "How old are you? " );
    age = sc.nextInt();

    System.out.print( "How tall are you? " );
    height = sc.next();

    System.out.print( "What is your GPA? " );
    gpa = sc.nextDouble();
    
    System.out.printf("You are %s of age %s and height %s is and gpa %s \n", firstName, age, height, gpa);

    }
}