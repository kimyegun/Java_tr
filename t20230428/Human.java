package t20230428;

public class Human {
	private String name; 	//이름
	private int height;		//신장
	private int weight;		//체중
	
	//---생성자---//
	public Human(String n, int h, int w) {
		name = n ; height = h; weight=w;
	}
	
	public String getName() {return name;}		//이름 가져오기
	public int getHeight() {return height;}	//신장 불러오기
	public int getWeight() {return weight;}	//체중 불러오기
	
	void gainWeight(int w) {weight +=w;}   //살이 찐다
	void reduceWeight(int w) {weight -=w;}   //살이 찐다
	
}
