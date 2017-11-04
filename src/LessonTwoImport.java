import java.util.Scanner;

public class LessonTwoImport {
	
	static Scanner userInput  =new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.print("Your favorite number: ");
		if(userInput.hasNextInt()) {
			int numberEntered = userInput.nextInt();
			
			System.out.println("You entered " + numberEntered) ;
			
			int numEnteredTime = numberEntered + numberEntered;
			System.out.println(numberEntered + "+" + numberEntered + "=" + numEnteredTime);
			
			int numEnteredMinus = numberEntered - numberEntered;
			System.out.println(numberEntered + "-" + numberEntered + "=" + numEnteredMinus);
			
			int numEnteredProduct = numberEntered * numberEntered;
			System.out.println(numberEntered + "*" + numberEntered + "=" + numEnteredProduct);
			
			int numEnteredDivTwo = numberEntered / 2;
			System.out.println(numberEntered + "/2=" + numEnteredDivTwo);
			
			int numEnteredRemainder = numberEntered % 2;
			System.out.println(numberEntered + "%2=" + numEnteredRemainder);
			
			int whichIsBigger = Math.max(numEnteredDivTwo, numEnteredMinus);
			System.out.println("This number " + whichIsBigger +" Bigger");
			
			int numCeil = (int) Math.ceil(5.34);
			
			
		}else {
			System.out.println("Enter an intergar next time");
		}
	}
}

//hasNextInt = if the user inputs intergar next