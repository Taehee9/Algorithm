/*
 * Baekjoon_11720.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 10. 28
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.Scanner;

/**
 * baekjoon #11720
 * https://www.acmicpc.net/problem/11720
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 10. 28.
 */
public class Baekjoon_11720 {

	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int tcNum = scan.nextInt();
		if(tcNum > 0 && tcNum <= 100){			
			String a = scan.next();
			int result = 0;
			for(int i = 0; i < tcNum; i++){
				// Character.getNumericValue(char) = double 형의 숫자
				result += Character.getNumericValue(a.charAt(i));
			}
			System.out.println(result);
		}
		scan.close();
	}

}