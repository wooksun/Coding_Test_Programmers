package programmers.test.lv0;

// 덧셈 출력식 

import java.util.Scanner;

//	두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
//	a + b = c
//	제한사항: 1 ≤ a, b ≤ 100
//	입출력 예) 입력: 4 5, 출력: 4 + 5 = 9

public class Lv0_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a+b));
	}

}
