package programmers.test.lv0;

import java.util.Scanner;

//	자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
//	제한 사항: 1 ≤ n ≤ 1,000

//	입력: 100 
//	출력: 100 is even

//	입력: 1
//	출력: 1 is odd

public class Lv0_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.print(a+" is even");
		} else {
			System.out.print(a+" is odd");
		}
		
	}

}
