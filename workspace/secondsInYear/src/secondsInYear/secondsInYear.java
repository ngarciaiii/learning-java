package secondsInYear;

public class secondsInYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days = 365;
		int hours = 24;
		int minutes = 60;
		int seconds = 60;
		
		int totalHours = days * hours;
		int totalMinutes = totalHours * minutes;
		int totalSeconds = totalMinutes * seconds;
		
		System.out.println("There are " + totalSeconds + " seconds in a year.");

	}
	
	//Printed 31536000 as an answer
}
