/*
 * Baekjoon_1001.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 10. 18
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.Scanner;

/**
 * baekjoon #1001
 * a, b 입력받고 a - b 출력
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 10. 18.
 */
public class Baekjoon_1001 {

	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a - b);
		scan.close();
	}

}
