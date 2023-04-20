package t20230420;

import java.util.Random;
import java.util.Scanner;

public class ColumChart {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요수 수:");
		int n = stdIn.nextInt();
		int[] a= new int[n];
		
		for (int i = 0; i < n; i++)
			a[i] = 1 + rand.nextInt(10);
		
		for (int i = 10; i >= 1; i--) {
			for (int j = 0; j < n; j++)
				if (a[j] >=i)
					System.out.print("*");
				else
					System.out.println(" ");
			System.out.println();
		}
		for (int i = 0; i < 2 * n; i++)
			System.out.print('-');
		System.out.println();
		
		for (int i= 0; i < n; i++)
			System.out.print(i %10+" ");
		System.out.println();
		}
			
	}

