package ch04Monday;

import java.util.Scanner;

public class dowhile응용게임 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ran = (int) (Math.random() * 100) + 1;// 정수 임의값 저장 반복문안에 없어서 처음실행할때만 값고정
		int cnt = 1;// 이거의 역활이뭐임? 몇번쳣는지 알려주는거임
		do {
			System.out.println("1부터 100까지의 숫자 입력");
			int num = scanner.nextInt();
			if (num == ran) {
				System.out.println("축하" + cnt + "번 만에맞췃슴");
				break;
			} else if (num > ran) {
				System.out.println("숫자가 큼");
			} else {
				System.out.println("숫자가 적음");
			}
			cnt++;
		} while (true);

	}

}
