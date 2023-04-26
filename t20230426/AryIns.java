package t20230426;

import java.util.Scanner;

public class AryIns {
	
	//---배열adml a[idx]에 x를 삽입(뒤에 있는 요소를 하나씩 오른쪽으로 이동시킴) ---//
	static void aryIns(int[] a, int idx, int x) {
		if (idx >= 0 && idx < a.length) {
			for (int i = a.length -1; i > idx; i--)
				a[i] = a[i -1];
			a[idx] = x;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int num = stdIn.nextInt();
		int[] a = new int [num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("삽입할 요소의 인덱스: ");
		int idx = stdIn.nextInt();
		
		System.out.print("삽입할 값: ");
		int n = stdIn.nextInt();
		
		aryIns(a, idx,n);
		
		for (int i = 0; i < num; i++)
			System.out.println("a[" + i + "]= " + a[i]);
	}

}
