/*
 * Baekjoon_1009.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 10. 21
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.Scanner;

/**
 * baekjoon #1009
 * https://www.acmicpc.net/problem/1009
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 10. 21.
 */
public class Baekjoon_1009 {

	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int tcNum = scan.nextInt();
		int tc[] = new int[2];
		int result = 1;
		for(int i = 0; i < tcNum; i++){
			result = 1;
			for(int j = 0; j < 2; j++){
				tc[j] = scan.nextInt();
			}
			for(int k = 0; k < tc[1]; k++){
				result = result * tc[0] % 10;
			}
			if(result == 0){
				result = 10;
			}
			System.out.println(result);
		}
		
		scan.close();
	}

}
