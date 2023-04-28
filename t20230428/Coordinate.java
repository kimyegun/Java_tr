package t20230428;

public class Coordinate {
	private double x; //x좌표
	private double y; //y좌표
	
	//---생성자---//
	public Coordinate() { }
	public Coordinate(double x, double y) { set(x,y); }
	public Coordinate(Coordinate c) { this(c.x, c.y);}
	
	public double getX() { return x;} 		// x좌표 가져오기
	public double getY() { return y;} 		// y좌표 가져오기

	public void setX(double x) {this.x=x;}	//x좌표 설정
	public void setY(double y) {this.y=y;}	//y좌표 설정
	
	public void set(double x, double y) {this.x = x; this.y = y; }		//좌표설정
	public boolean equals(Coordinate c) {return x == c.x && y == c.y;}		//좌표설정
	public String toString() {return "(" + x + "," + y + ")";}
}


