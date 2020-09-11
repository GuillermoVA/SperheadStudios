import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class test {

	@Test
	public void assignHandTestRock() {
		
		Play play = Mockito.spy(new Play());
		String handTest = play.assignHand(0);
		Mockito.verify(play).assignHand(0);
	}
	
	@Test
	public void assignHandTestPaper() {
		
		Play play = Mockito.spy(new Play());
		String handTest = play.assignHand(1);
		Mockito.verify(play).assignHand(1);
	}
	
	@Test
	public void assignHandTestScissors() {
		
		Play play = Mockito.spy(new Play());
		String handTest = play.assignHand(2);
		Mockito.verify(play).assignHand(2);
	}
	
	
	@Test
	public void winnerTestTie1() {
		
		Play play = Mockito.spy(new Play());
		String handTest = play.winner("Rock", "Rock");
		Mockito.verify(play).winner("Rock", "Rock");
	}
	
	@Test
	public void winnerTestTie2() {
		
		Play play = Mockito.spy(new Play());
		String handTest = play.winner("Paper", "Paper");
		Mockito.verify(play).winner("Paper", "Paper");
	}
	
	@Test
	public void winnerTestTie3() {
		
		Play play = Mockito.spy(new Play());
		String handTest = play.winner("Scissors", "Scissors");
		Mockito.verify(play).winner("Scissors", "Scissors");
	}
	
	@Test
	public void winnerTest1() {
		
		Play play = Mockito.spy(new Play());
		Play.winner("Rock", "Paper");
		Mockito.verify(play);
		Play.winner("Rock", "Paper");
	}
	
	@Test
	public void winnerTest2() {
		
		Play play = Mockito.spy(new Play());
		Play.winner("Rock", "Scissors");
		Mockito.verify(play);
		Play.winner("Rock", "Scissors");
	}
	
	@Test
	public void winnerTest3() {
		
		Play play = Mockito.spy(new Play());
		play.winner("Scissors", "Rock");
		Mockito.verify(play).winner("Scissors", "Rock");
	}
	
	@Test
	public void winnerTest4() {
		
		Play play = Mockito.spy(new Play());
		play.winner("Scissors", "Paper");
		Mockito.verify(play).winner("Scissors", "Paper");
	}
	
	@Test
	public void winnerTest5() {
		
		Play play = Mockito.spy(new Play());
		Play.winner("Paper", "Scissors");
		Mockito.verify(play);
		Play.winner("Paper", "Scissors");
	}
	
	@Test
	public void winnerTest6() {
		
		Play play = Mockito.spy(new Play());
		Play.winner("Paper", "Rock");
		Mockito.verify(play);
		Play.winner("Paper", "Rock");
	}
	
	
	
	
	
	

}
