package hard;

public class HeightConverter {
	
	// here is apply overloading and example ...
	
	// 1 In -> 2.54 cm
	public static double convertToCentimeters(int Inches) {
		return (Inches * 2.54);
	}
	
	// 1 Ft -> 12 In
	// 1 Ft -> 12 In * 2.54 -> cm
	
	// or simple 1 Ft -> 30.48 cm
	public static double convertToCentimeters(int Feet , int Inches) {
		return (convertToCentimeters((Feet * 12) + Inches));
		
	}
	
	
	// here is a link for conversions : 
	// https://www.metric-conversions.org/lengh/feet-to-centimeters.htm
	

}
