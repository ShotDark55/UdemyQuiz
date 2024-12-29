package hard;

public class SecondsAndMinutesConverter {
	
	public static void main(String[] args) {
		System.out.println(getDurationString(3945)); // example 1 
		System.out.println(getDurationString(65,45)); // example 2
		
	}
	
	public static String getDurationString(int seconds) {
		
		int minute = seconds / 60;
		return getDurationString(minute, seconds);
		
		
	}
	
	public static String getDurationString(int minute , int seconds) {
		
		int hour = minute / 60;
	
		int remainingMinutes = minute % 60;
		int remainingSeconds = seconds % 60;
	
		
	return hour +"h " + remainingMinutes + "m " + remainingSeconds + "s";
	
	}

}
