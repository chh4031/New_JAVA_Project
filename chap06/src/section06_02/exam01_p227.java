package section06_02;

public class exam01_p227 {
	public static void main(String[] args) {
		//객체의 생성, 인스턴트화
		exam01_01_p227 myCar = new exam01_01_p227();
		
		//필드의 값을 읽기
		System.out.println("제작회사 : " + myCar.company);//.연산자는 개체 접근 연산자로 객체가 가진 필드나 메소드를 쓰고자 할 때 사용, 필드의 company 값을 읽어들임.
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);//int의 기본값은 0이다.
		
		//필드값의 수정.
		myCar.speed = 100;
		System.out.println("수정해본 현재속도 : " + myCar.speed);//필드값을 수정했다.
		
	}

}
