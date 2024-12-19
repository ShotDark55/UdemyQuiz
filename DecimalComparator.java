package hard;

public class DecimalComparator {
	
//	public static void main(String[] args) {
//			int x = 1;
//			System.out.println(++x + ") " + areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//			System.out.println(++x + ") " + areEqualByThreeDecimalPlaces(3.175, 3.176));	
//			System.out.println(++x + ") " + areEqualByThreeDecimalPlaces(3.0, 3.0));
//			System.out.println(++x + ") " + areEqualByThreeDecimalPlaces(-3.123, 3.123));
//				
//				
//				
//				
//	}


	public static boolean areEqualByThreeDecimalPlaces(double number_1, double number_2) {
			
			int n1 = (int)(number_1 * 1000);
			int n2 = (int)(number_2 * 1000);
//			System.out.println("n1 : " + n1);
//			System.out.println("n2 : " + n2);
			if (n1==n2) {
				return true;
			}else {
				return false;
			}
		
			
		
	}

}
