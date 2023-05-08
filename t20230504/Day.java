package t20230504;

public class Day {
	private int year = 1;	// 연
	private int month = 1;  // 월
	private int date = 1;   // 일
	
	//---각 월의 일수---//
	private static int[][] mdays = {
	{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
	{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //윤년
	};
	
	//---y년은 윤년인가?---//
	public static boolean isLeap(int y) {
		return y % 4 ==0 
	}
}
