package programmers.test.lv0;

//	문제 설명
//	연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//	12 ⊕ 3 = 123
//	3 ⊕ 12 = 312
//	양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
//	단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.

//	입출력 예) a=2, b=91 출력=364
//	-> a ⊕ b = 291 이고, 2 * a * b = 364 입니다. 둘 중 더 큰 값은 364 이므로 364를 return 합니다.

public class Lv0_15 {

	public int main(int a, int b) {
		int answer = 0;
		
		answer = (Integer.parseInt(a+""+b+"") > (2*a*b))?Integer.parseInt(a+""+b+""):(2*a*b);
		
		return answer;
	}

}
