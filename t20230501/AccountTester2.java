package t20230501;

import java.util.Scanner;

public class AccountTester2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("계좌 정보를 입력하세요.");
		System.out.print("명  의: ");
		String name = stdIn.next();
		System.out.print("잔  고: ");
		long balance = stdIn.nextLong();
		System.out.print("개설 연도:");
		int y = stdIn.nextInt();
		System.out.print("개설 월:");
		int m = stdIn.nextInt();
		System.out.print("개설 일: ");
		int d = stdIn.nextInt();
		
		
		Account a = new Account(name, no, balance, new Day(y, m, d));
	}

}
