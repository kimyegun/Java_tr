package t20230503;

import static java.util.GregorianCialendar.*;

import java.util.GregorianCalendar;

public class Point2D {
	
	private static int counter = 0;   //몇 번까지 식별 번호를 부여했는까

	private static int day;                //오늘 날짜

	private int x = 0;                      //x좌표

	private int y = 0;				//y좌표

	//---클래스 초기화 블록---//

	static {

	GregorianCalendar today = new GregorianCalendar();

	day = today.get(Date);   // today의 일
	}

	//---인스턴스 초기화 블록---//

	{

	if (++counter == day) {

	System.out.print("당첨!!");

	System.out.println("오늘 %d개의 좌표가 생성됐습니다.\n, counter");

	}

	}

	//---생성자---//

	public Point2D() {}

	public Point2D(int x) {this.x = x;}

	public Point2D(int x, int y) {this.x = x; this.y = y;}

	public int getX() {return x;}	//x좌표의 게터

	public int getY() {return y;}	//y좌표의 게터

	//마지막에 부여한 식별 번호

	public static int getCounter() {return counter;}

	//---문자열 표현 "(x, y)"을 반환---//

	public String toString() {

	return "(" + x + "," + y + ")";

	}

	}

	public Point2D() {

	if (++counter == day) {

	System.out.print("당첨!!");

	System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);

	}
	this.x = x;

	}

	public Point2D(int x) {

	if (++counter == day) {

	System.out.print("당첨!!");

	System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);

	}

	this.x = x;	this.y = y;

	}

