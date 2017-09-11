package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Round;
import pkgCore.eGameResult;

public class RoundTest {

	@Test
	public void test() {
		for(int a=0;a<1000;a++) 
		{
			Round B= new Round();
			if (B.getList().size() == 1)
			{
				if(B.geteGameResult()==eGameResult.NATURAL)
				{
					
				}
				
				else if(B.geteGameResult()==eGameResult.CRAPS) 
				{
					
				}
				
			
			
				else 
				{
				    fail ("wrong");
				}
			
			}
			
			
			
			else if( B.getList().getFirst().getScore() == B.getList().getLast().getScore())
				{
					if(B.geteGameResult()!=eGameResult.POINT)
					{
						fail("should be pont");
					}
					 
			
				}
			
			else {
				if(B.geteGameResult()!=eGameResult.SEVEN_OUT)
				{
					fail("should be seven");
				}
			}
		}
	}
}
