package t20230426;

import java.util.Scanner;

public class SetBit {
	//---int형 비트 구성 ---//
	static void printBits(int x) {
		for (int i = 31; i >=0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	//---x의 pos 위치에 있는 비트를 1로 변경한 값을 반환 ---//
	static int set(int x, int pos) {
		return x | (1 << pos);
	}
	
	//---x의 pos 위치에 있는 비트를 0으로 변경한 값을 반환 ---//
		static int reset(int x, int pos) {
			return x & ~(1 << pos);
	}
		
	//---x의 pos 위치에 있는 비트를 반전시킨 값을 반환 ---//
		static int inverse(int x, int pos) {
			return x^ (1 << pos);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수x의 pos번째 비트를 변경합니다.");
		System.out.print("x: "); int x = stdIn.nextInt();
		System.out.print("pos: "); int pos = stdIn.nextInt();
		
		System.out.print("x                     ="); printBits(x);
		System.out.print("\nset(x, pos)         ="); printBits(set(x, pos));
		System.out.print("\nrset(x, pos)        ="); printBits(reset(x, pos));
		System.out.print("\ninverse(x, pos      ="); printBits(inverse(x, pos));
		System.out.println();
	}
}
