package t20230504;
/**
 * HorzLine 클래스는 수평선을 나타내는 클래스이다.
 * 이 클래스는 직선을 나타내는 추상 클래스 AbsLine에서 파생된 클래스이다.
 * @author 시바다
 *@see Shape
 *@see AbstLine
 */
public abstract class HorzLine extends AbstLine {
	/**
	 * 수평선을 생성하는 생성자이다.
	 * 길이를 인수로 받는다.
	 * @param length 생성할 직선의 길이
	 */

	public HorzLine(int length) {
		super(length);
	}
	
	/**
	 * toString 메서드는 수평선에 관련된 도형 정보를 문자열로 반환한다.
	 * @return 문자열 "HorzLine(length:3)"을 반환한다.\
	 * 3부분은 길이에 해당하는 값이다.
	 */

	public String toString() {
		return "HorzLine(length:" + getLength() + ")";
	}
	
	/**
	 * draw 메서드는 수평선을 그린다.
	 * 마이너스 기호 '-'를 옆으로 나열해서 그린다.
	 * 길이의 개수만큼 '-'를 연속으로 표시한 후 줄 바꿈한다.
	 */
	public void draw() {
		for (int i = 0; i < getLength(); i++)
			System.out.println('-');
		System.out.println();
			
		}
	}

