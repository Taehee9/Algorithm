/*
 * Baekjoon_10992.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 10. 23
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.Scanner;

/**
 * baekjoon #10992
 * https://www.acmicpc.net/problem/10992
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 10. 23.
 */
public class Baekjoon_10992 {

	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int tcNum = scan.nextInt();
		for(int i = 0; i < tcNum; i++){
			for(int j = tcNum-1; j > i; j--){
				System.out.print(" ");
			}
			for(int k = 1; k <= ( (2 * i) + 1); k++){
				if(2 <= k && k <= (2 * i) && i < (tcNum - 1)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();;
		}
		scan.close();
	}

}
