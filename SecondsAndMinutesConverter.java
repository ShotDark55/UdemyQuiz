package hard;

public class SecondsAndMinutesConverter {
	
	public static void main(String[] args) {
		System.out.println(getDurationString(-3945)); // example 1 
		System.out.println(getDurationString(-65,45)); // example 2
		System.out.println(getDurationString(65,145));
		System.out.println(getDurationString(65,45));
		System.out.println(getDurationString(3945));
		
	}
	
	public static String getDurationString(int seconds) {
		
		if (seconds < 0) {
			return "Invalid data for seconds (" + seconds + ") must be a positive integer value";
			 
		}
		
		int minute = seconds / 60;
		return getDurationString(minute, seconds);
			
		
	}
	
	public static String getDurationString(int minute , int seconds) {
		
		
		
		
			if (minute < 0) {
					
				return "Invalid data for minute (" + minute + ") must be a positive integer value";
			}
			
			
			if (seconds < 0 || seconds > 59 ) {
				return "Invalid data for second (" + seconds + ") must be between 0 and 59";
			}
			
			
			int hour = minute / 60;
			
			int remainingMinutes = minute % 60;
			int remainingSeconds = seconds % 60;
		
			
		        return hour +"h " + remainingMinutes + "m " + remainingSeconds + "s";
			
			
			
		
	
	}

}
