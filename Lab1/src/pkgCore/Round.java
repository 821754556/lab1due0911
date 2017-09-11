package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	
    
    
	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore

		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
// TODO: value the eGameResult after the round is complete
     
		Roll First = new Roll();
		rolls.add(First);
		ComeOutScore=First.getScore();
		
		
		
		switch(ComeOutScore) {
		case 2:
		case 3:
		case 12:
			eGameResult=eGameResult.CRAPS;
				break;
		case 7:
		case 11:
			eGameResult=eGameResult.NATURAL;
			default: 
				do {
					Roll r =new Roll();
					rolls.add(r);
					
					
					if(r.getScore()==ComeOutScore) {
						eGameResult=eGameResult.POINT;
						break;
					}
					else if (r.getScore()==7) 
					{
						eGameResult=eGameResult.SEVEN_OUT;
						break;
					}
					
				
				
				}while(true);
		}
	}
				
		
			
			
			
	public eGameResult geteGameResult() {
		return eGameResult;
	}
		
		
	   
		
    
    
	
	

	public LinkedList<Roll> getList() {
		// Return the roll count
		//return the value of the linked list rolls
		return rolls;
	}

}
