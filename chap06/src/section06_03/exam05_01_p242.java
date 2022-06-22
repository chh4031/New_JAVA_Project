package section06_03;

public class exam05_01_p242 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	//생성자
	exam05_01_p242(){//기본 생성자	
	}
	
	exam05_01_p242(String model){
		this(model, "은색", 250);//맨 아래 생성자에서 선언된 것을 바탕으로 model, color, maxspeed값을 호출한다. 즉 중복값을 줄여씀.
		/*
		 * this.model = model;
		 * this.color = "은색";
		 * this.maxspeed = 250;
		 * 
		 * 이라는 값을 this를 이용해 중복값을 맨 아래에서 가져오기
		 */
	}
	
	exam05_01_p242(String model, String color){//단 매개변수와 맞게 써야함. 매개변수가 선언되지 않은 값을 아래 this에서 쓰면 오류발생, 그래서 this에서는 초기화해서 씀.
		this(model, color, 250);
		/*
		 * this.model = model;
		 * this.color = color;
		 * this.maxspeed = 250;
		 * 
		 * 이라는 값을 this를 이용해 중복값을 맨 아래에서 가져오기
		 */
	}
	
	exam05_01_p242(String model, String color, int maxspeed){//이 아래것이 바로 공통실행 코드가 되고, 위에서는 해당 코드들을 호출해서 쓴다
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
