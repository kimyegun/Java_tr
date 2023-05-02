package t20230502;

public class Id {
	static int counter = 0;
	private int id;
	
	public Id() {
		id =++counter;
	}
	
	public int getId() {
		return id;
	}
}
