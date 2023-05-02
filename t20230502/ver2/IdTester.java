package t20230502.ver2;

public class IdTester {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a의 식별 번호:" + a.getId());
		System.out.println("b의 식별 번호:" + b.getId());
		
		System.out.println("마지막으로 부여한 식별 번호 = " + Id.getMaxId());
		System.out.println("마지막으로 부여한 식별 번호 = " + a.getMaxId());
		System.out.println("마지막으로 부여한 식별 번호 = " + b.getMaxId());
	}

}
