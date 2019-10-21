/*
 * Baekjoon_1003.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 10. 18
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.Scanner;

/**
 * baekjoon #1003
 * https://www.acmicpc.net/problem/1003
 * 피보나치를 호출했을 때 0과 1이 몇 번 호출되는지 구하라.
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 10. 18.
 */
public class Baekjoon_1003 {
	
	public static void fn_fibonacci(int[][] value, int n){
		if(n >= 2){
			for(int i=2; i<= n; i++){
                value[i][0] = value[i-1][0] + value[i-2][0];
                value[i][1] = value[i-1][1] + value[i-2][1];
            }
		}
		System.out.println(value[n][0] + " " + value[n][1]);
	}
	
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		// 테스트케이스 개수
		int t = scan.nextInt();
		// 0과 1의 개수 초기화
		int value[][] = new int[41][2];
		value[0][0] = 1;
		value[1][1] = 1;
		
		for(int i = 0; i < t; i++){
			fn_fibonacci(value, scan.nextInt());
		}
		scan.close();
	}

}
