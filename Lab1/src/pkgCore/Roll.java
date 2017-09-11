package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private static int Score;

	public Roll() {
		// TODO: Create an instance of d1 and d2...
		// TODO: Determine 'Score'
	 
	 
	
	 Score= d1.getDieValue() + d2.getDieValue();
	 
	 
	 
	 
	  
	}

	public static int getScore() {
		return Score;
	}

}
