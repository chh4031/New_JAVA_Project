package homework;

import java.util.Scanner;
import java.util.Arrays;
//import java.util.Collections; �������� �迭 ���Ŀ� ���� �ߴµ� �Ⱦ��Ե�.

public class CHH_20191598_1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String user_name = "Guest";
		int again = 0;
		int k = -1;
		int score_win = 0, score_lose = 0, score_draw = 0;
		
		int[] rank_title = new int[100];//�������� �⺻�� 100�� ������ ����� �� �ְ���. ���Ѵ� �������� ���� ������ �߻�.
		/*for(int i = 0; i<rank_title.length;i++) { ��� ��. �⺻ ���� 0���� �˾����Ƿ�.
			rank_title[i] = 0;
		}*/
		
		System.out.print("�̸��� �����Ͻðڽ��ϱ�? �̸��� �����Ͻø� �������� �� �� �ֽ��ϴ�. YES : 1, NO : 2 \n�Է� : ");//1�ƴϸ� �ƹ��ų�. ���� ���� ù ����ÿ��� ���.
		int select_name = sc.nextInt();//�̸� �Է� �� ���ΰ�?
		if(select_name == 1) {
			String error_block_1 = sc.nextLine();//Scanner�� ������ ���� int������ ���� �� enter�� nextLine()�� �Է°����� �޾Ƽ� ����� ������ �ذ��ϴ� �κ�
			System.out.print("�̸��� ������ �ּ���.\n�Է� : ");
			user_name = sc.nextLine();
			System.out.println("����� �̸��� " + user_name + "�Դϴ�.");
		}
		else {
			System.out.println("�̸��� �������� �ʾҽ��ϴ�. �⺻���� <Guest>�Դϴ�.");
		}
		
		
		do {
		
		int score_count = 0;
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.print("���Ӹ�带 ���� �ּ���. 1���� ��������, 2���� ��ũ����, 3���� �������(��ǻ�� vs ��ǻ��)�Դϴ�. 4���� ������ �Դϴ�. \n�Է� : ");
		int select_game = sc.nextInt();//���� ��� ���ϱ�. �ڼ��Ѱ� �Ʒ� ����.
		
		if(select_game == 1) {//�������� ���
			int normal_count = 0;
			int win = 0, lose = 0, draw = 0, foul = 0;
			
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("���������� �����մϴ�!");
		
			while(true) { // �������� �ڵ�
			
				int COM = (int) (Math.random()* 3) + 1;
				//���ǻ� ������ 1 ������ 2 ���� 3�̶� ����
				//System.out.println(COM); �������� 1~3�� ������ Ȯ��.
			
				System.out.print("������ 1, ������ 2, ���� 3 �Դϴ�. �����ߴ��� 4 �Դϴ�. \n�Է� : ");
				int THO = sc.nextInt();//����ڰ��� int������ �ٷ� �ޱ�.
			
				switch(THO) {
				case 1:
					if(COM == 1) {
						System.out.println("�Ѵ� ���");
						draw++;
					}else if(COM == 2) {
						System.out.println("��ǻ���� �¸�");
						lose++;
					}else {
						System.out.println("������� �¸�");
						win++;
					}
					break;
				
				case 2:
					if(COM == 1) {
						System.out.println("������� �¸�");
						win++;
					}else if(COM == 2) {
						System.out.println("�Ѵ� ���");
						draw++;
					}else {
						System.out.println("��ǻ���� �¸�");
						lose++;
					}
					break;
					
				case 3:
					if(COM == 1) {
						System.out.println("��ǻ���� �¸�");
						lose++;
					}else if(COM == 2) {
						System.out.println("������� �¸�");
						win++;
					}else {
						System.out.println("�Ѵ� ���");
						draw++;
					}
					break;
					
				case 4:
					System.out.println("���������� ����Ǿ����ϴ�.");
					break;
				
				default:
					System.out.println("�߸��� ���Դϴ�.");
					foul++;
					break;
				}//switch �� ����
				
				normal_count++;
				
				if(THO == 4) {
					break;
				}//if �� ����
			}//while �� ����, �������� ����.
			System.out.println("�� " + normal_count + "�� ������ ����Ǿ����ϴ�.");
			System.out.println("����� �̱�Ƚ���� " + win + "ȸ, ���Ƚ���� " + draw + "ȸ, �й�Ƚ���� " + lose + "ȸ, ��Ģ�� " + foul + "ȸ �Դϴ�.");
		}//�������Ӹ�� ���� if��
		
		
		else if(select_game == 2) {//��ũ���� �ڵ�
			k++;//��ũ������ Ƚ���� ������.
			score_count = 0;
			int rank_count = 0;
			int win = 0, lose = 0, draw = 0, foul = 0;
			int scissors = 0, rock = 0, paper = 0;
			
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("��ũ������ �����մϴ�! �� 10ȸ�� ��ȸ�� �־����ϴ�. ������ ���� �� �������� ���� ������ �� �� �ֽ��ϴ�.");
			System.out.println("�¸��� +1��, ���� �������� ����, �й�� -1�� �Դϴ�. �ٸ����� ���� ��Ģ�Դϴ�. ��Ģ�� Ƚ���� ����(-5��) �����˴ϴ�.");
			
			/*System.out.print("�г����� �Է��� �ּ���.(��ŷ���忡 ����� �г���) \n�Է� : "); �� �̻� �� �� ����.
			String error_block_1 = sc.nextLine();//Scanner�� ������ ���� int������ ���� �� enter�� nextLine()�� �Է°����� �޾Ƽ� ����� ������ �ذ��ϴ� �κ�
			user_name = sc.nextLine();//��ŷ���忡 �� �г��� �Է�.
			System.out.println("����� �г����� " + user_name + "�Դϴ�.");*/
			
			while(rank_count < 10) {
			
				int COM = (int) (Math.random()* 3) + 1;
				
				System.out.print("������ 1, ������ 2, ���� 3 �Դϴ�. \n�Է� : ");
				int THO = sc.nextInt();
				
				switch(THO) {
				case 1:
					if(COM == 1) {
						System.out.println("�Ѵ� ���");
						draw++;
					}else if(COM == 2) {
						System.out.println("��ǻ���� �¸�");
						lose++;
						score_count -= 1;
					}else {
						System.out.println(user_name + "���� �¸�");
						win++;
						score_count += 1;
					}
					scissors++;
					break;
				
				case 2:
					if(COM == 1) {
						System.out.println(user_name + "���� �¸�");
						win++;
						score_count += 1;
					}else if(COM == 2) {
						System.out.println("�Ѵ� ���");
						draw++;
					}else {
						System.out.println("��ǻ���� �¸�");
						lose++;
						score_count -= 1;
					}
					rock++;
					break;
					
				case 3:
					if(COM == 1) {
						System.out.println("��ǻ���� �¸�");
						lose++;
						score_count -= 1;
					}else if(COM == 2) {
						System.out.println(user_name + "���� �¸�");
						win++;
						score_count += 1;
					}else {
						System.out.println("�Ѵ� ���");
						draw++;
					}
					paper++;
					break;
				
				default:
					System.out.println("�߸��� ���Դϴ�. ���� -5��, ȸ���� 1ȸ �����˴ϴ�.");
					foul++;
					score_count -= 5;
					break;
					}//switch �� ����
				rank_count++;
			}//while �� ����
			System.out.println("��ŷ���� ����Ǿ����ϴ�." + user_name + "���� �̱�Ƚ���� " + win + "ȸ, ���Ƚ���� " + draw + "ȸ, �й�Ƚ���� " + lose + "ȸ, ��Ģ�� " + foul + "ȸ �Դϴ�.");
			System.out.println(user_name + "���� ������ " + scissors + "�� ������ " + rock + "�� ���� " + paper + "�� ���̽��ϴ�.");
			System.out.println(user_name + "���� ������ " + score_count + "���Դϴ�");
			
			if(win > lose) {//�����ǿ� �� �̱�Ƚ�� �й�Ƚ�� ���Ƚ��
				score_win++;
			}
			else if(win < lose) {
				score_lose++;
			}
			else {
				score_draw++;
			}
			
			rank_title[k] = score_count;//�迭�� ������ �����Ŵ.
			
		}//��ŷ��� ���� if��
		
		
		else if(select_game == 3) {//�������� ���
			int win = 0, lose = 0, draw = 0;
			
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("��ǻ��_1�� ��ǻ��_2 ���� �������� �����մϴ�! (��������)");
			System.out.print("������ Ƚ���� ���� �ּ��� : ");
			
			int com_count = sc.nextInt();//����ڰ� ������ Ƚ���� ������.
			int com_count_value = 0;
			
			while(com_count_value < com_count) {//����� Ƚ���� ���� �ݺ�.
			
				int COM = (int) (Math.random()* 3) + 1;
				int COM_other = (int) (Math.random()* 3) + 1;
				//System.out.println(COM);
				//System.out.println(COM_other);
				
				switch (COM) {
				case 1:
					if(COM == 1) {
						if(COM_other == 1) {
							System.out.println("��ǻ��_1: <����>, ��ǻ��_2: <����>");
							System.out.println("�Ѵ� ���");
							draw++;
						}
						else if(COM_other == 2) {
							System.out.println("��ǻ��_1: <����>, ��ǻ��_2: <����>");
							System.out.println("��ǻ��_2�� �¸�");
							lose++;
						}
						else {
							System.out.println("��ǻ��_1: <����>, ��ǻ��_2: <��>");
							System.out.println("��ǻ��_1�� �¸�");
							win++;
						}
					}
					break;
					
				case 2:
					if(COM == 2) {
						if(COM_other == 1) {
							System.out.println("��ǻ��_1: <����>, ��ǻ��_2: <����>");
							System.out.println("��ǻ��_1�� �¸�");
							win++;
						}
						else if(COM_other == 2) {
							System.out.println("��ǻ��_1: <����>, ��ǻ��_2: <����>");
							System.out.println("�Ѵ� ���");
							draw++;
						}
						else {
							System.out.println("��ǻ��_1: <����>, ��ǻ��_2: <��>");
							System.out.println("��ǻ��_2�� �¸�");
							lose++;
						}
					}
					break;
				
				case 3:
					if(COM == 3) {
						if(COM_other == 1) {
							System.out.println("��ǻ��_1: <��>, ��ǻ��_2: <����>");
							System.out.println("��ǻ��_2�� �¸�");
							lose++;
						}
						else if(COM_other == 2) {
							System.out.println("��ǻ��_1: <��>, ��ǻ��_2: <����>");
							System.out.println("��ǻ��_1�� �¸�");
							win++;
						}
						else {
							System.out.println("��ǻ��_1: <��>, ��ǻ��_2: <��>");
							System.out.println("�Ѵ� ���");
							draw++;
						}
					}
					break;
				
				default:
					//�� ��찡 ����. ��ǻ�ͳ����� 1~3�� ��.
					//break;
					}//switch �� ����.
				com_count_value++;
			}//while �� ����.
			System.out.println("��ǻ��_1�� �̱�Ƚ���� " + win +"ȸ �й�Ƚ���� " + lose + "ȸ ���Ƚ���� " + draw + "ȸ �Դϴ�.");
			System.out.println("��ǻ��_2�� �̱�Ƚ���� " + lose +"ȸ �й�Ƚ���� " + win + "ȸ ���Ƚ���� " + draw + "ȸ �Դϴ�.");
		}//�������Ӹ�� ����. if�� ����.
		
		
		else if(select_game == 4) {//������
			if(user_name == "Guest") {
				System.out.println("----------------------------------------------------------------------------------------------------");
				System.out.println("Guset�� �������� �� �� �����ϴ�.");
			}
			else {
				System.out.println("----------------------------------------------------------------------------------------------------");
				System.out.println(user_name + " ���� ������ <��ũ���� �� Ƚ�� : " + (k+1) + "ȸ > ��ũ���ӿ����� �¸�Ƚ�� : " + score_win + "ȸ �й�Ƚ�� : "+ score_lose + "ȸ ���Ƚ�� : " + score_draw + "ȸ");
				
				int rank_num = 1;
				for(int i = 99;i>=90;i--) {//���Ѵ� ������ ���ؼ� ���������� ���� ����. 100����� ���� �����ؼ� �ݴ�� �������� ������ �ؼ� ������ �����غ�.
					Arrays.sort(rank_title);//�������� ����, ���ܰ� �߻��Ұ��� ����ؼ� �ݺ��Ҷ����� ���Ľ��ѹ���.
					System.out.println(rank_num + "�� ������ : " + rank_title[i]);
					rank_num++;
				}
			}
		}
		else {
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("�߸��� ���Դϴ�.");
		}
		
		//System.out.println(user_name); �������� Ȯ�ο�
		//System.out.println(score_count); �������� Ȯ�ο�
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.print("�ٽ� �Ͻðڽ��ϱ�? �ٽ��Ϸ��� 1, �����Ϸ��� �ƹ����ڸ� �Է��ϼ���.\n�Է� : ");
		again = sc.nextInt();
		
		//rank_title[k] = score_count;//�迭�� ������ �����Ŵ.
		
		}while (again == 1);
	}//main
}//class



/*
 * ��뺯�� ��� �� ����
 * �������� �ٸ��� ���ٽᵵ ������ �򰥸� �� �־� ���� ���� ���� �и���.
 * do while �� �Ⱥ��� �������� ������. do while ���� �ٸ� {} ���� �͵��� ���� �������� ����.
 * 
 * sc(����) = Scanner ����
 * 
 * COM(����) = ��ǻ�Ͱ� ���� ����������
 * THO(����) = ����ڰ� ���� ����������
 * COM_other(����) = ��ǻ�� vs ��ǻ�Ϳ��� �ٸ� ��ǻ�Ͱ� ���� ����������
 * user_name(����) = �����̸� �Է�(��ŷ�� ����) >>> ��ŷ����
 * again(����) = �ٽ� �ϰڴ��� ����� �� �ޱ�.
 * select_name(����) = �̸��� �����Ұ��ΰ�?
 * 
 * selcet_game(����) = � Ÿ���� �������� ���� ����  1. ��������(���Ѵ�, �����ݿ�X) 2. ��ũ���� 3. �������(��ǻ�� vs ��ǻ��) 4. ������
 * normal_count(����) = ������� Ƚ�� ����.
 * com_count(����) = ��������� Ƚ�� ����.
 * com_count_value(����) = ������� Ƚ���� ��������.
 * rank_count(����) = ��ũ���� Ƚ���� ��������.
 * score_count(����) = ��ũ������ ������������. >>> ��ŷ����
 * rank_num(����) = �������
 * 
 * win(����) = �¸�Ƚ�� ����
 * lose(����) = �й�Ƚ�� ����
 * draw(����) = ���Ƚ�� ����
 * foul(����) = ��ĢȽ�� ����
 * 
 * scissors(����) = ���� �� Ƚ��
 * rock(����) = ���� �� Ƚ��
 * paper(����) = �� �� Ƚ��
 * 
 * score_win(����) = �� �̱�Ƚ��
 * score_lose(����) = �� �й�Ƚ��
 * score_draw(����) = �� ���Ƚ��
 * 
 * k(����) = �迭�� ��° ���� �����ϱ� ���� ���� ���� ex)rank_title[k]�ε� ������ k�� 0�� ���� ������ 1�϶� ������ ��� �ֱ� ����.
 * 
 * error_block_1(����) = Scanner �� ������ �ذ��ϱ� ���� ����
 * 
 * rank_title[](�迭 ��ü) = ��ũ���� �������� �����ϱ� ���� �迭
 * 
 */