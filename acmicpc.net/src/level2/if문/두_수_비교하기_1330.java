// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
// [입력] 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
// -10,000 ≤ A, B ≤ 10,000

package level2.if문;

import java.util.Scanner;

public class 두_수_비교하기_1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 문제상으로 정수 입력받기
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B)
			System.out.println(">");
		else if(A<B)
			System.out.println("<");
		else
			System.out.println("==");
	}
}
