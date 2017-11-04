
public class LessonThree {
	public static void main(String args[]) {
		int randomNumber = (int)	(Math.random()*50);
		System.out.println("Value of Random number is " + randomNumber);
		
		if(randomNumber < 50 || randomNumber > 40) {
			System.out.println("The Random number is less than 50");
		}else if(randomNumber < 40 || randomNumber > 30) {
			System.out.println("The Random number is  less than 40" );
		}else if(randomNumber < 30 || randomNumber > 20){
			System.out.println("The Random number is less than 30");
		}else if(randomNumber != 42){
			System.out.println("The Random number is not equal to 40");
		}else{
			System.out.println("The Random number is" + randomNumber );
		}
	}

}
