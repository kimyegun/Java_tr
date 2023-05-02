package t20230501;

public class Human3 {
	private String name;
	private int height;
	private int weight;
	
	Human3(String n, int h, int w) {
		name = n; height = h ; weight = w;
	}
	
	String getName() {return name;}
	int getHeight() {return height;}
	int getWeight() {return weight;}
	
	void gainWeight(int w) {weight += w;}
	void reduceWeight(int w) {weight += w;}

}
