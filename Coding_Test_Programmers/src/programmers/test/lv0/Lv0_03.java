package programmers.test.lv0;

import java.util.Scanner;

public class Lv0_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(""+str);
		}
	}
}
