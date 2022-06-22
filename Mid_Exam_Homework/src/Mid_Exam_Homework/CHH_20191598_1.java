package Mid_Exam_Homework;

import java.util.Scanner;
import java.util.Arrays;
//import java.util.Collections; 내림차순 배열 정렬에 쓰려 했는데 안쓰게됨.

public class CHH_20191598_1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String user_name = "Guest";
		int again = 0;
		int k = -1;
		int score_win = 0, score_lose = 0, score_draw = 0;
		
		int[] rank_title = new int[100];//점수판의 기본은 100개 점수를 기록할 수 있게함. 무한대 구현에는 여러 에러가 발생.
		/*for(int i = 0; i<rank_title.length;i++) { 없어도 됨. 기본 값이 0임을 알았으므로.
			rank_title[i] = 0;
		}*/
		
		System.out.print("이름을 설정하시겠습니까? 이름을 설정하시면 점수판을 볼 수 있습니다. YES : 1, NO : 2 \n입력 : ");//1아니면 아무거나. 게임 시작 첫 실행시에만 물어봄.
		int select_name = sc.nextInt();//이름 입력 할 것인가?
		if(select_name == 1) {
			String error_block_1 = sc.nextLine();//Scanner의 오류로 인해 int형으로 받은 후 enter를 nextLine()의 입력값으로 받아서 생기는 오류를 해결하는 부분
			System.out.print("이름을 설정해 주세요.\n입력 : ");
			user_name = sc.nextLine();
			System.out.println("당신의 이름은 " + user_name + "입니다.");
		}
		else {
			System.out.println("이름을 설정하지 않았습니다. 기본값은 <Guest>입니다.");
		}
		
		
		do {
		
		int score_count = 0;
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.print("게임모드를 정해 주세요. 1번은 자유게임, 2번은 랭크게임, 3번은 관전모드(컴퓨터 vs 컴퓨터)입니다. 4번은 점수판 입니다. \n입력 : ");
		int select_game = sc.nextInt();//게임 모드 정하기. 자세한거 아래 참고.
		
		if(select_game == 1) {//자유게임 모드
			int normal_count = 0;
			int win = 0, lose = 0, draw = 0, foul = 0;
			
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("자유게임을 시작합니다!");
		
			while(true) { // 자유게임 코드
			
				int COM = (int) (Math.random()* 3) + 1;
				//편의상 가위를 1 바위를 2 보를 3이라 지정
				//System.out.println(COM); 랜덤으로 1~3이 나오나 확인.
			
				System.out.print("가위는 1, 바위는 2, 보는 3 입니다. 게임중단은 4 입니다. \n입력 : ");
				int THO = sc.nextInt();//사용자값을 int형으로 바로 받기.
			
				switch(THO) {
				case 1:
					if(COM == 1) {
						System.out.println("둘다 비김");
						draw++;
					}else if(COM == 2) {
						System.out.println("컴퓨터의 승리");
						lose++;
					}else {
						System.out.println("사용자의 승리");
						win++;
					}
					break;
				
				case 2:
					if(COM == 1) {
						System.out.println("사용자의 승리");
						win++;
					}else if(COM == 2) {
						System.out.println("둘다 비김");
						draw++;
					}else {
						System.out.println("컴퓨터의 승리");
						lose++;
					}
					break;
					
				case 3:
					if(COM == 1) {
						System.out.println("컴퓨터의 승리");
						lose++;
					}else if(COM == 2) {
						System.out.println("사용자의 승리");
						win++;
					}else {
						System.out.println("둘다 비김");
						draw++;
					}
					break;
					
				case 4:
					System.out.println("자유게임이 종료되었습니다.");
					break;
				
				default:
					System.out.println("잘못된 값입니다.");
					foul++;
					break;
				}//switch 문 종료
				
				normal_count++;
				
				if(THO == 4) {
					break;
				}//if 문 종료
			}//while 문 종료, 자유게임 종료.
			System.out.println("총 " + normal_count + "번 게임이 진행되었습니다.");
			System.out.println("당신의 이긴횟수는 " + win + "회, 비긴횟수는 " + draw + "회, 패배횟수는 " + lose + "회, 반칙은 " + foul + "회 입니다.");
		}//자유게임모드 종료 if문
		
		
		else if(select_game == 2) {//랭크게임 코드
			k++;//랭크게임의 횟수를 저장함.
			score_count = 0;
			int rank_count = 0;
			int win = 0, lose = 0, draw = 0, foul = 0;
			int scissors = 0, rock = 0, paper = 0;
			
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("랭크게임을 시작합니다! 총 10회의 기회가 주어집니다. 게임이 끝난 후 점수판을 통해 점수를 볼 수 있습니다.");
			System.out.println("승리시 +1점, 비길시 점수변동 없음, 패배시 -1점 입니다. 다른값을 내면 반칙입니다. 반칙은 횟수와 점수(-5점) 차감됩니다.");
			
			/*System.out.print("닉네임을 입력해 주세요.(랭킹보드에 기재될 닉네임) \n입력 : "); 더 이상 쓸 수 없음.
			String error_block_1 = sc.nextLine();//Scanner의 오류로 인해 int형으로 받은 후 enter를 nextLine()의 입력값으로 받아서 생기는 오류를 해결하는 부분
			user_name = sc.nextLine();//랭킹보드에 들어갈 닉네임 입력.
			System.out.println("당신의 닉네임은 " + user_name + "입니다.");*/
			
			while(rank_count < 10) {
			
				int COM = (int) (Math.random()* 3) + 1;
				
				System.out.print("가위는 1, 바위는 2, 보는 3 입니다. \n입력 : ");
				int THO = sc.nextInt();
				
				switch(THO) {
				case 1:
					if(COM == 1) {
						System.out.println("둘다 비김");
						draw++;
					}else if(COM == 2) {
						System.out.println("컴퓨터의 승리");
						lose++;
						score_count -= 1;
					}else {
						System.out.println(user_name + "님의 승리");
						win++;
						score_count += 1;
					}
					scissors++;
					break;
				
				case 2:
					if(COM == 1) {
						System.out.println(user_name + "님의 승리");
						win++;
						score_count += 1;
					}else if(COM == 2) {
						System.out.println("둘다 비김");
						draw++;
					}else {
						System.out.println("컴퓨터의 승리");
						lose++;
						score_count -= 1;
					}
					rock++;
					break;
					
				case 3:
					if(COM == 1) {
						System.out.println("컴퓨터의 승리");
						lose++;
						score_count -= 1;
					}else if(COM == 2) {
						System.out.println(user_name + "님의 승리");
						win++;
						score_count += 1;
					}else {
						System.out.println("둘다 비김");
						draw++;
					}
					paper++;
					break;
				
				default:
					System.out.println("잘못된 값입니다. 점수 -5점, 회수가 1회 차감됩니다.");
					foul++;
					score_count -= 5;
					break;
					}//switch 문 종료
				rank_count++;
			}//while 문 종료
			System.out.println("랭킹전이 종료되었습니다." + user_name + "님의 이긴횟수는 " + win + "회, 비긴횟수는 " + draw + "회, 패배횟수는 " + lose + "회, 반칙은 " + foul + "회 입니다.");
			System.out.println(user_name + "님은 가위는 " + scissors + "번 바위는 " + rock + "번 보는 " + paper + "번 내셨습니다.");
			System.out.println(user_name + "님의 점수는 " + score_count + "점입니다");
			
			if(win > lose) {//점수판에 쓸 이긴횟수 패배횟수 비긴횟수
				score_win++;
			}
			else if(win < lose) {
				score_lose++;
			}
			else {
				score_draw++;
			}
			
			rank_title[k] = score_count;//배열에 점수를 저장시킴.
			
		}//랭킹모드 종료 if문
		
		
		else if(select_game == 3) {//관전게임 모드
			int win = 0, lose = 0, draw = 0;
			
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("컴퓨터_1와 컴퓨터_2 간의 모의전을 시작합니다! (관전게임)");
			System.out.print("모의전 횟수를 정해 주세요 : ");
			
			int com_count = sc.nextInt();//사용자가 모의전 횟수를 지정함.
			int com_count_value = 0;
			
			while(com_count_value < com_count) {//모드전 횟수에 따라 반복.
			
				int COM = (int) (Math.random()* 3) + 1;
				int COM_other = (int) (Math.random()* 3) + 1;
				//System.out.println(COM);
				//System.out.println(COM_other);
				
				switch (COM) {
				case 1:
					if(COM == 1) {
						if(COM_other == 1) {
							System.out.println("컴퓨터_1: <가위>, 컴퓨터_2: <가위>");
							System.out.println("둘다 비김");
							draw++;
						}
						else if(COM_other == 2) {
							System.out.println("컴퓨터_1: <가위>, 컴퓨터_2: <바위>");
							System.out.println("컴퓨터_2의 승리");
							lose++;
						}
						else {
							System.out.println("컴퓨터_1: <가위>, 컴퓨터_2: <보>");
							System.out.println("컴퓨터_1의 승리");
							win++;
						}
					}
					break;
					
				case 2:
					if(COM == 2) {
						if(COM_other == 1) {
							System.out.println("컴퓨터_1: <바위>, 컴퓨터_2: <가위>");
							System.out.println("컴퓨터_1의 승리");
							win++;
						}
						else if(COM_other == 2) {
							System.out.println("컴퓨터_1: <바위>, 컴퓨터_2: <바위>");
							System.out.println("둘다 비김");
							draw++;
						}
						else {
							System.out.println("컴퓨터_1: <바위>, 컴퓨터_2: <보>");
							System.out.println("컴퓨터_2의 승리");
							lose++;
						}
					}
					break;
				
				case 3:
					if(COM == 3) {
						if(COM_other == 1) {
							System.out.println("컴퓨터_1: <보>, 컴퓨터_2: <가위>");
							System.out.println("컴퓨터_2의 승리");
							lose++;
						}
						else if(COM_other == 2) {
							System.out.println("컴퓨터_1: <보>, 컴퓨터_2: <바위>");
							System.out.println("컴퓨터_1의 승리");
							win++;
						}
						else {
							System.out.println("컴퓨터_1: <보>, 컴퓨터_2: <보>");
							System.out.println("둘다 비김");
							draw++;
						}
					}
					break;
				
				default:
					//이 경우가 없다. 컴퓨터끼리는 1~3만 함.
					//break;
					}//switch 문 종료.
				com_count_value++;
			}//while 문 종료.
			System.out.println("컴퓨터_1은 이긴횟수가 " + win +"회 패배횟수가 " + lose + "회 비긴횟수가 " + draw + "회 입니다.");
			System.out.println("컴퓨터_2은 이긴횟수가 " + lose +"회 패배횟수가 " + win + "회 비긴횟수가 " + draw + "회 입니다.");
		}//관전게임모드 종료. if문 종료.
		
		
		else if(select_game == 4) {//점수판
			if(user_name == "Guest") {
				System.out.println("----------------------------------------------------------------------------------------------------");
				System.out.println("Guset는 점수판을 볼 수 없습니다.");
			}
			else {
				System.out.println("----------------------------------------------------------------------------------------------------");
				System.out.println(user_name + " 님의 점수판 <랭크게임 총 횟수 : " + (k+1) + "회 > 랭크게임에서의 승리횟수 : " + score_win + "회 패배횟수 : "+ score_lose + "회 비긴횟수 : " + score_draw + "회");
				
				int rank_num = 1;
				for(int i = 99;i>=90;i--) {//무한대 구현을 못해서 내림차순도 쓰지 않음. 100개라는 값을 지정해서 반대로 내려오는 순으로 해서 순위를 지정해봄.
					Arrays.sort(rank_title);//오름차순 정렬, 예외가 발생할것을 대비해서 반복할때마다 정렬시켜버림.
					System.out.println(rank_num + "등 점수는 : " + rank_title[i]);
					rank_num++;
				}
			}
		}
		else {
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("잘못된 값입니다.");
		}
		
		//System.out.println(user_name); 전역변수 확인용
		//System.out.println(score_count); 전역변수 확인용
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.print("다시 하시겠습니까? 다시하려면 1, 종료하려면 아무숫자를 입력하세요.\n입력 : ");
		again = sc.nextInt();
		
		//rank_title[k] = score_count;//배열에 점수를 저장시킴.
		
		}while (again == 1);
	}//main
}//class



/*
 * 사용변수 목록 및 설명
 * 지역변수 다른데 갖다써도 되지만 헷갈릴 수 있어 각각 변수 따로 분리함.
 * do while 문 안부터 전역으로 가정함. do while 안쪽 다른 {} 안의 것들은 전부 지역으로 가정.
 * 
 * sc(전역) = Scanner 변수
 * 
 * COM(지역) = 컴퓨터가 내는 가위바위보
 * THO(지역) = 사용자가 내는 가위바위보
 * COM_other(지역) = 컴퓨터 vs 컴퓨터에서 다른 컴퓨터가 내는 가위바위보
 * user_name(전역) = 유저이름 입력(랭킹전 한정) >>> 랭킹보드
 * again(전역) = 다시 하겠는지 사용자 값 받기.
 * select_name(전역) = 이름을 설정할것인가?
 * 
 * selcet_game(전역) = 어떤 타입의 게임으로 할지 결정  1. 자유게임(무한대, 점수반영X) 2. 랭크게임 3. 관전모드(컴퓨터 vs 컴퓨터) 4. 점수판
 * normal_count(지역) = 자유모드 횟수 변수.
 * com_count(지역) = 관전모드의 횟수 지정.
 * com_count_value(지역) = 관전모드 횟수의 증감변수.
 * rank_count(지역) = 랭크게임 횟수의 증감변수.
 * score_count(전역) = 랭크게임의 점수변동변수. >>> 랭킹보드
 * rank_num(지역) = 등수변수
 * 
 * win(지역) = 승리횟수 변수
 * lose(지역) = 패배횟수 변수
 * draw(지역) = 비긴횟수 변수
 * foul(지역) = 반칙횟수 변수
 * 
 * scissors(지역) = 가위 내 횟수
 * rock(지역) = 바위 낸 횟수
 * paper(지역) = 보 낸 횟수
 * 
 * score_win(전역) = 총 이긴횟수
 * score_lose(전역) = 총 패배횟수
 * score_draw(전역) = 총 비긴횟수
 * 
 * k(전역) = 배열의 번째 수를 지정하기 위해 넣은 변수 ex)rank_title[k]인데 이유가 k가 0일 때의 점수값 1일때 점수값 등등 넣기 위해.
 * 
 * error_block_1(지역) = Scanner 의 오류를 해결하기 위한 변수
 * 
 * rank_title[](배열 객체) = 랭크전의 점수값을 저장하기 위한 배열
 * 
 */
