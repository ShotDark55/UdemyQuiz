package hard;

public class BarkingDog {
    
    
 	public static boolean shouldWakeUp (boolean barking  ,int hourOfDay) {
 		if (hourOfDay >= 0 && hourOfDay <= 23) { // range  0 - 23 .....
 			if (barking) {
 				if (hourOfDay < 8 || hourOfDay > 22) { // before 8 hour or after 22 hour
 					return true;
 			
 			   	}
 		   }
 			
 	}
 		return false;
 	}
 
}