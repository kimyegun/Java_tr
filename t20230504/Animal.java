package t20230504;

public class Animal {
	private String name;	//이름
	public Animal(String name) { this.name = name; } //생성자
	public abstract void bark();					 //짖기
	public String getName() {return name;}
}

class Dog extends Animal {
	private String type;
	public Dog(String name, String type) {		//생성자
		super(name); this.type = type;
	}
	public void bark() {System.out.println("멍멍!"); //짖기
}
	
	//---고양이 클래스 (Ver.1)---//
class Cat extends Animal {
	private int age;
	public Cat(String name, int age) {
		super(name); this.age = age;
	}
	public void bark() {System.out.println("냐옹!"); } //짖기
}
}