package t20230421;

import java.util.Scanner;

public class LinearSearchBottom {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); //scanner 객체를 생성 키입력을 받기위해 sysrem.in사용
		
		System.out.print("요소 수:");
		int n = stdIn.nextInt(); //요소 수 값 입력
		int[] a = new int [n]; // 배열반복 생성
		
		for (int j=0;j < n; j++) {   //for 반복횟수를 명확히 알때 사용
			System.out.print("a[" + j +  "] = ");  //
			a[j] = stdIn.nextInt();				   //반복횟수 값 입력
		}
		
		System.out.print("찾을 숫자:");	//찾을숫자 출력
		int key = stdIn.nextInt();		//찾을숫자 입력
		
		//0~6 배열값을 만들었으니 
		int i;
		for (i = n-1; i >=0; i--)		//
			if (a[i] == key)  			//
				break;
		
		if (i >=0 )		//탐색 성공
			System.out.println("그 값은 a[" + i + "]에 있습니다.");
		else			//탐색 실패
			System.out.println("해당 값이 존재하지 않습니다.");

		}
	}

