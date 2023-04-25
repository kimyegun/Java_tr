package t20230425;

import java.util.Scanner;

public class IsoscelesTriangleLB {
	//---문자c를 n개 연속 표시 ---//
	static void putChars(char c, int n) {
		while (n-- > 0)
			System.out.print(c);
	}

	//---문자 '*'를 n개 연속 표시 ---//
	static void putStars(int n) {
		putChars('*', n);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는: ");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}
}

//-참고 : 문제 4-22로부터   
/* for (int i = 1; i <= n; i++) {
	for (int j = 1; j <= i; j++)
		System.out.print('*');
	System.out.println();
} */













