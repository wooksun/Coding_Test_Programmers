package programmers.test.lv0;

//	문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

//	제한 사항: 1 ≤ my_string의 길이 ≤ 100
//			   my_string은 영소문자로만 이루어져 있습니다.
//			   1 ≤ k ≤ 100

//	입.출력 예) 
//	입력: my_string: "string", k: 3	/ 출력: "stringstringstring"


public class Lv0_13 {

	public String main(String my_string, int k) {
		String answer = "";
		
		for(int i=0; i<k; i++) {
			answer = answer + my_string;
		}
		return answer;
	}

}
