package section06_03;

public class exam04_p239 {
	public static void main(String[] args) {
		
		
		//�������̵��� �������� ��� ����
		exam04_01_p239 car1 = new exam04_01_p239();
		System.out.println("car1.company : " + car1.company);
		System.out.println("\n");
		
		exam04_01_p239 car2 = new exam04_01_p239("�ڰ���");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("\n");
		
		exam04_01_p239 car3 = new exam04_01_p239("�ڰ���", "����");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("\n");
		
		exam04_01_p239 car4 = new exam04_01_p239("�ڰ���", "����", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxspeed : " + car4.maxspeed);
		System.out.println("\n");
	}
}