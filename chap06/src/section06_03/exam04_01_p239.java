package section06_03;

public class exam04_01_p239 {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxspeed;
	
	//������
	exam04_01_p239(){//�⺻ ������	
	}
	
	exam04_01_p239(String model){//�������̵��� �ؼ� �����ڸ� �� ����.�� �Ű������� �̸��� �ٲٴ� ���� �������̵��� �ƴϴ�. ������ �Ȱ����� �� ����� ������
		this.model = model;
	}
	
	exam04_01_p239(String model, String color){//�������̵����� ������ �߰�
		this.model = model;
		this.color = color;
	}
	
	exam04_01_p239(String model, String color, int maxspeed){//�������̵����� ������ �߰�
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}

}