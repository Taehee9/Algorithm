/*
 * Baekjoon_10991.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 10. 23
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.Scanner;

/**
 * baekjoon #10991
 * https://www.acmicpc.net/problem/10991
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 10. 23.
 */
public class Baekjoon_10991 {

	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int tcNum = scan.nextInt();
		for(int i = 0; i < tcNum; i++){
			for(int j = tcNum-1; j > i; j--){
				System.out.print(" ");
			}
			if(i == 0){
				System.out.print("*");
			}else {
				for(int k = 0; k < i + 1; k++){
					System.out.print("*");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
