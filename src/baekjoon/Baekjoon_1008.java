/*
 * Baekjoon_1008.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 10. 18
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.Scanner;

/**
 * baekjoon #1008
 * a, b 입력받고 a / b 출력
 * 실제 정답과 출력값의 절대오차 또는 상대오차가 10^(-9) 이하이면 정답
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 10. 18.
 */
public class Baekjoon_1008 {

	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println(a / b);
		scan.close();
	}

}
