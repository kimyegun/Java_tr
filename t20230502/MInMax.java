package t20230502;

public class MInMax {
	
	public static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	public static int min(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		return min;
	}
	
	public static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] < min)
				min = a[i];
		return min;
		}
	
	public static int[] minIndexArray(int[] a) {
		int min = min(a);
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] == min)
				count++;
		
		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i--)
			if (a[i] == min)
				c[count--] = i;
		return c;
		}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public static int max(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;
	}
	
	public static int max(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
			return max;
		}
		public static int[] maxIndexArray(int[] a) {
			int max = max(a);
			int count = 0;
			for (int i = 0; i < a.length; i++) 
				if (a[i] == max)
					count++;
			
			int[] c = new int[count--];
			for (int i = a.length - 1; count >= 0; i--)
				if (a[i] == max)
					c[count--] = i;
			return c;
			
	}
}
