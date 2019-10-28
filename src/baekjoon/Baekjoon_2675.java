/*
 * Baekjoon_2675.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 10. 28
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.Scanner;

/**
 * baekjoon #2675
 * https://www.acmicpc.net/problem/2675
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 10. 28.
 */
public class Baekjoon_2675 {

	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int tcNum = scan.nextInt();
		for(int i = 0; i < tcNum; i++){
			int num = scan.nextInt();
			String s = scan.next();
			for(int j = 0; j < s.length(); j++){
				for(int k = 0; k < num; k++){
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
		scan.close();
	}

}