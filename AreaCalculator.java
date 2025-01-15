package hard;

public class AreaCalculator {
	    // write code here
	    
  public static double area(double radius) {
        // for circle area
        if (radius >= 0 ) {
            
            return (radius * radius * Math.PI);
            
        }
        
        return -1.0;
  }
	        
	    
	    
	public static double area(double x , double y ) {
	        // for rectangle area
		
		if (x >= 0.0 && y >= 0.0) {
			
			return x * y;
		}
		
			return -1.0;
		
	    }
	 
	   
}
