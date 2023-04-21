//선형탐색
package t20230421;

import java.util.Scanner;

public class LinearSearchTop {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요소 수:");
		int n = stdIn.nextInt();		//요소 수 입력
		int [] a = new int[n];		// 배열 생성
		
		for (int j =0 ; j < n; j++) {  // 반복횟수(j은 0이고 n보다 커야하며 1씩 증가한다.)
			System.out.print("a[" + j + "] ="); //배열 반복 출력값
			a[j] = stdIn.nextInt();			  //배열 횟수 정숫값
		}
		
		System.out.println("찾을 숫자:");		
		int key = stdIn.nextInt();		//찾을 숫자 출력값 입력
		
		int i;		//i 변수선언
		for ( i = 0; i < n; i++)	//반복횟수 명확히알고 (i은 0이고 n보다 작아야하며 1씩증가)
			if (a[i] == key)		// 참이면 수행해라
				break;				//반복문이나 switch문 벗어나는데 사용
		
		if(i < n)					// i가 n보다 작으면 수행해라
			System.out.println("그 값은 a[" + i + "]에 있습니다.");   
		else						// if값이 i가 n보다 작으면 수행해라
			System.out.println("해당 값이 존재하지 않습니다.");
	}
}
