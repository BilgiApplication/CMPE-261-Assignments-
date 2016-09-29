import java.util.InputMismatchException;
import java.util.Scanner;

// Here is my test class.
/**
 * @author veyisegemenerden
 *
 */
public class Test {
// this is my main method
	
	public static void main(String[] args) {
// i create a object which is name "cal".
		Calculate cal = new Calculate();
// if i stay face to face an error ,avoids crash of program with try catch blocks.
		try {
// this method  takes input from user
			System.out.println("What is your full name ?");
// scanner is a class which taking input from user.
			Scanner scanS = new Scanner(System.in);
			Scanner scan = new Scanner(System.in);
// i convert input to String.
			String nameOfStudent = scan.nextLine().trim();
          
// i avoid from repeat with for loop this works  six times for all assignment
//i started "i" from 1 because  Assignment starts with 1 .
	
			for (int i = 1; i < 7; i++) {
// I call here assignment method from class of Calculate.    
				System.out.println("What is your grade of Assignment" + i + "?");

//   Assignment grade part
				
				
				double assignmentGrade;
				do {
					System.out.println();
				    while (!scan.hasNextDouble()) {
				        System.out.println("That's not a number!");
				        scan.nextDouble(); 
				        
				    }
				    assignmentGrade = scan.nextDouble();
			
				} while (assignmentGrade <= 0);
				System.out.println("Thank you! Grade of Assignment"+i+" : " + assignmentGrade);
				
				System.out.println();
				
				System.out.println("Did you submit it on time ? (y/n)");
                
// Assignment submit time part
				String assignmentSubmit = scanS.nextLine().toLowerCase().trim();
				
//This if statement controls type of input.
				if(assignmentSubmit.equals("y") || assignmentSubmit.equals("n")){
					cal.assaignment(assignmentGrade, assignmentSubmit);
					System.out.println();
				
				}else{
					System.out.println("Please, use y/n ");
					System.out.println();
					System.out.println("Did you submit it on time ? y/n");
					assignmentSubmit = scanS.nextLine().toLowerCase().trim();
					
					if(assignmentSubmit.equals("y") || assignmentSubmit.equals("n")){
						cal.assaignment(assignmentGrade, assignmentSubmit);
						}else{
							
							System.out.println("Please , try again with intended type!!");
							System.exit(0);
					}
				}
				

			}
//Midterm Grade part
			System.out.println("What is your Midterm Grade?");
			double midtermGrade = scan.nextDouble();
            
//Final Grade part
			System.out.println("What is your Final Grade?");
			double finalGrade = scan.nextDouble();

// this sys.out method shows result first part a=name second part calls average method 
			
			System.out.println("Dear " + nameOfStudent + " Your avarage grade is : " + cal.average(cal.liste, midtermGrade, finalGrade));
 //Catch helps me for to catch error and i see that which error i was  taking
		} catch (InputMismatchException eror1) {
			System.out.println("Please write carefully!");
			System.out.println(eror1);
			
		} finally {
			System.out.println("Please try again!");
		}

	}

}
