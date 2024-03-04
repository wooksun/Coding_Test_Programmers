package programmers.test.lv0;

import java.util.Scanner;

//	문자열 str이 주어집니다.
//	문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

//	제한사항: 1 ≤ str의 길이 ≤ 10
//	입력: abcde
//	출력: a
//		  b
//		  c
//		  d
//		  e

public class Lv0_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int b = a.length();
		
		for(int i=0; i<b; i++) {
			System.out.println(a.charAt(i));
		} // for()
	} // main()  

}
