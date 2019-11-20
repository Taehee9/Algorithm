/*
 * Baekjoon_10818.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 11. 20
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.Scanner;

/**
 * baekjoon #10818
 * https://www.acmicpc.net/problem/10818
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 11. 20.
 */
public class Baekjoon_10818 {

	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		
		int tcNum = scan.nextInt();
		int[] num = new int[tcNum];

		for(int i = 0; i < tcNum; i++){
			num[i] = scan.nextInt();
		}
		
		int max = num[0];
		int min = num[0];
		
		for(int i = 1; i < tcNum; i++){
			// 최대값
			if(max < num[i]){
				max = num[i];
			}
			// 최소값
			if(min > num[i]){
				min = num[i];
			}
		}
		
		System.out.println(min + " " + max);
		scan.close();
	}

}