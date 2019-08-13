/*
	1. 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보시오.
	2. [제한사항]
		- arr은 길이 1이상, 100 이하인 배열이다.
		- arr의 원소는 -10,000 이상 10,000 이하인 정수이다.
	3. 입출력 예
		- [1,2,3,4] → 2,5
		- [5,5] → 5
 */

package level1;

public class 평균구하기 {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int size = arr.length;
		int sum = 0;
		double answer, answer2 = 0;

		for (int i = 0; i < size; i++) {
			sum+=arr[i];
		}
		answer=sum/size;
		answer2=sum%size;
		System.out.println(answer+answer2);

	}
}