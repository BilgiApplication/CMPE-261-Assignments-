import java.util.Scanner;

/**
 * @author veyisegemenerden
 *
 */
public class Calculate {

	public void assaignment(double a, String b) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
       // if user did your homework on time 
		if (b.equals("y")) {
		

		}
		// if user did't your homework on time 
		if (b.equals("n")) {
			System.out.println("Did you submit it within 10 hours after the dead line? y/n");
             //I want to use substring because maybe user can write yes yeap yup or just y there i only took first letter
			//I used toLowerCase because if statement more sensetive about case
			String a1T = sc.nextLine().substring(0, 1).toLowerCase();
			
			if (a1T.equals("y")) {
				a = a - (a * 0.10);

			} else {
				a = 0.0;

			}

		}
	    //I call addToList for to hold calculated grades 
		Calculate.addToList(a);
		
	}

	static int assignmentCount;

	static double[] liste = new double[6];
     // I add user's assignment to list for holding
	public static void addToList(double addedAssignment) {

		liste[assignmentCount] = addedAssignment;
		assignmentCount++;

	}
// I use this method for controlling
	public static void yaz() {
		for (int i = 0; i < assignmentCount; i++) {
			System.out.println(liste[i]);

		}
	}
     // method calculates user's average grade this method uses list of assignment , final grade and midterm grade
	 public double average ( double [] i,double a,double b){
  	   double[] coefficient ={0.15,0.10,0.20,0.25,0.15,0.15};
  	 double result = 0; 
  	   for(int k = 0; k<=5; k++){
			
			result = i[k]*coefficient[k] + result;
			if(k==5){
				
				result = (result * 0.45) + a*0.25+b*0.30;
			}
			
		}
  	   
  	   return result;
     }






































}
