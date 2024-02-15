package programmers.test.lv0;

import java.util.Scanner;

//	영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
//	1 ≤ str의 길이 ≤ 20
//	str은 알파벳으로 이루어진 문자열입니다.
//	입출력 예) aBcDeFg => AbCdEfG

public class Lv0_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		char[] arr;
		arr = a.toCharArray();
		
		for(int i=0; i<arr.length; ++i) {
			if(65<=arr[i] && arr[i]<=90) {
				arr[i]=(char)(arr[i]+32);
				continue;
			}
			if(97<=arr[i] && arr[i]<=122) {
				arr[i]=(char)(arr[i]-32);
				continue;
			}
		}
		System.out.println(arr);
		
	}

}
