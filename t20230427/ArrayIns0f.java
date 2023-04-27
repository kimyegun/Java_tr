package t20230427;

import java.util.Scanner;

public class ArrayIns0f {
	//---배열 a의 a[idx]에 x를 삽입한 배열을 반환---//
	static int[] arrayIns0f(int[] a, int idx, int x) {
		if (idx < 0 || idx > a.length)
			return a.clone();
		else {
		int[] c = new int[a.length + 1];
		int i = 0;
		for (; i < idx; i++)
			c[i] = a[i];
		for(;i < a.length; i++)
			c[i + 1] = a[i];
		c[idx] = x;
		return c;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];			//요소 수가 n인 배열
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("삽입할 인덱스");
		int idx = stdIn.nextInt();
		
		System.out.print("삽입할 값: ");
		int n = stdIn.nextInt();		//배열 x의[idx]에 n을 삽입한 배열 생성
		
		int[] y = arrayIns0f(x, idx, n);
		
		for(int i = 0; i < y.length; i++)	//배열 y 표시
			System.out.println("y[" + i + "]=" + y[i]);
	}

}
