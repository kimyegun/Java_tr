package t20230501;

public class AccountTester1 {
	public static void maib(String[] args) {
		Day d = new Day(2010, 10, 15);
		Account gildong = new Account("길동", "125768", 100);
		
		Day p = gildong.getOpenDay();
		System.out.println("계좌 개설일: " + p);
		
		p.set(1999, 12, 31);
		
		Day q = gildong.getOpenDay();
		System.out.println("계좌 개설일: " + q);
	}

}
