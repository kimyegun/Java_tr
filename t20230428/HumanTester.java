package t20230428;

public class HumanTester {

	public static void main(String[] args) {
		Human gildong = new Human("길동", 170, 60);
		Human chulsu = new Human("철수", 166, 72);
		
		gildong.gainWeight(3);		//길동이 3kg 쪘다
		chulsu.reduceWeight(5);		//철수가 5kg 빠졌다
		
		System.out.println("이름:" + gildong.getName());			//gildong의 데이터표시
		System.out.println("신장:" + gildong.getHeight() + "cm");
		System.out.println("체중:" + gildong.getWeight() + "kg");
		System.out.println();
		
		System.out.println("이름:" + chulsu.getName());
		System.out.println("신장:" + chulsu.getHeight() + "cm"); 	//chulsu의 데이터표시
		System.out.println("체중:" + chulsu.getWeight() + "kg");
		
	}

}
