package section06_01;

public class exam01_p219 {
	public static void main(String[] args) {
		exam01_01_p219 s1 = new exam01_01_p219(); // 앞의 exam01_01_p219는 클래스 선언, s1는 변수, new는 클래스로 부터 객체 생성, 뒤의 exam_01_01_p219는 생성자
		System.out.println("s1 변수가 exam01_01_p219 객체를 참조한다.");
		
		exam01_01_p219 s2 = new exam01_01_p219(); // 이러한 과정을 또 인스턴스화 라고 한다. 클래스로부터 만들어진 객체를 뜻함.
		System.out.println("s2 변수가 또 다른 exam01_01_p219 객체를 참조한다.");
	}
}

/*
 * 
 * 
package section06_01;

public class exam01_01_p219 {

	public static void main(String[] args) {
		exam01_01_p219 s1 = new exam01_01_p219(); // 앞의 exam01_01_p219는 클래스 선언, s1는 변수, new는 클래스로 부터 객체 생성, 뒤의 exam_01_01_p219는 생성자
		System.out.println("s1 변수가 exam01_01_p219 객체를 참조한다.");
		
		exam01_01_p219 s2 = new exam01_01_p219(); // 이러한 과정을 또 인스턴스화 라고 한다. 클래스로부터 만들어진 객체를 뜻함.
		System.out.println("s2 변수가 또 다른 exam01_01_p219 객체를 참조한다.");
		}
	}
	
	이렇게 하나로도 쓸 수 있으나 분리해서 사용할 것을 권함.
	
	클래스는 
	public class ABC{
	
	int abc; 필드
	
	ABC(){ 생성자
	
	}
	
	void methodName(){ 메소드
	
	}
	로 구성됨
*/