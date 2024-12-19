package hard;

public class EqualSumChecker {
	
	
	
	public static boolean hasEqualSum(int x, int y , int result) {
		int expted = x + y;
		if (expted == result) {
			return true;
		}
		return false;
	}
	

}
