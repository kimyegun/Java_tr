package t20230501;

public class HumanTester3 {

	public static void main(String[] args) {
		Human3 gildong = new Human3("길동", 170, 60);
		Human3 chulsu = new Human3("철수", 166, 72);
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(5);
		
		System.out.println("이름:" + gildong.getName());
		System.out.println("신장:" + gildong.getHeight() + "cm");
		System.out.println("신장:" + gildong.getWeight() + "kg");
		System.out.println();
		
		System.out.println("이름:" + gildong.getName());
		System.out.println("신장:" + gildong.getHeight() + "cm");
		System.out.println("신장:" + gildong.getWeight() + "kg");
	}

}
