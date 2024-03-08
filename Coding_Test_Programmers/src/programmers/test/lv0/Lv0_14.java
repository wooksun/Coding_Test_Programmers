package programmers.test.lv0;

//	문제 설명
//	연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//	12 ⊕ 3 = 123
//	3 ⊕ 12 = 312
//	양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//	단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.

//	제한사항: 1 ≤ a, b < 10,000

//	a ⊕ b = 991 이고, b ⊕ a = 919 입니다. 둘 중 더 큰 값은 991 이므로 991을 return 합니다.
//	a ⊕ b = 898 이고, b ⊕ a = 889 입니다. 둘 중 더 큰 값은 898 이므로 898을 return 합니다.

public class Lv0_14 {

	public int main(int a, int b) {
		int answer = 0;
		
		String answerA = String.valueOf(a);
		String answerB = String.valueOf(b);
		
		answer = Integer.valueOf(answerA + answerB);
		
		int answer2 = Integer.valueOf(answerB + answerA);

		if (answer < answer2) {
			answer = answer2;
		}
		return answer;
	}

}
