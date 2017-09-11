package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
    private int x;
    private int y;
    private int z;
    
	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore

		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
// TODO: value the eGameResult after the round is complete
     
		y = Roll.getScore();
		z=y;
		x=1;
		if(y==2|y==3|y==12|y==7|y==11) {
			x=1;
		}
		else {
			y=Roll.getScore();
			while(y==z|y==7){
				y=Roll.getScore();
				x=x+1;
				
			}
			
			
			
		}
		
		ComeOutScore=y;
	   }
		
    
    
	
	

	public int RollCount() {
		// Return the roll count
		return x;
	}

}
