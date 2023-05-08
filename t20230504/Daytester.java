package t20230504;

import java.util.Scanner;

import t20230501.Day;

public class Daytester {
	static Scanner stdIn = new Scanner(System.in);
	
	//---날짜 관련 정보 표시---//
	static void display(Day day) {
		System.out.println(day + "에 관한 정보");
		System.out.println("윤년"+(day.isLeap()?"입니다.":"이 아닙니다."));
		System.out.println("연도 내 경과 일수:" + day.day0fWeek());
		System.out.println("연도 내 잔여 일수:" + day.leftDay0fYear());
	}
	
	//---날짜 변경---//
	static void change(Day day) {
		System.out.println("[1]연월일을 변경 [2]연을 변경");
		System.out.println("[3]월을 변경 [4]일을 변경");
		System.out.println("[5]1일 뒤 [6]1일 앞");
		System.out.print("[7]n일 뒤 [8]n일 앞");
		
		int change = stdIn.nextInt();
		int y = 0, m = 0, d = 0, n = 0;
		if (change == 1 || change == 2) {
			System.out.print("연:"); y = stdIn.nextInt();
		}
		if (change == 1 || change == 3) {
			System.out.print("월:"); m = stdIn.nextInt();
		}
		if (change == 1 || change == 4) {
			System.out.print("일:"); d = stdIn.nextInt();
		}
		if (change == 7 || change == 8 ) {
			System.out.print("며칠:"); n = stdIn.nextInt();
		}
		
		switch (change) {
		case 1:   breal
		}
	}

}
