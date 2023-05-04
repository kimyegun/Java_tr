package t20230504;

public class CatTester3 {

	public static void main(String[] args) {
		Car car1 = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015, 12, 24));
	car1.move(10, 10);
	//System.out.println("총 주행 거리:" + car1.getTotalMileage());
	System.out.println("총 주행 거리:" + ((ExCar)car1).getTotalMileage());
	}

}
