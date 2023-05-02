package t20230502.ver2;

public class Id {
	private static int counter = 0;
	private int id;
	
	public Id() {
		id = ++counter;
	}
	
	public int getId() {return id;}
	
	public static int getMaxId() {
		return counter;
	}

}
