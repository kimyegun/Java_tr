package t20230508;

import java.util.Random;

public class ComputerPlayer extends Player {
	private static Random rand;
	static {
		rand = new Random();
	}
	
	//---손 결정(난수를 통해 생성)---//
	
	@Override
	public int nextHand() {
		return rand.nextInt(3);
	}
	

}
