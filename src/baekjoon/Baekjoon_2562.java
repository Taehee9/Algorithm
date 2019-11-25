/*
 * Baekjoon_2562.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 11. 25
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * baekjoon #2562
 * https://www.acmicpc.net/problem/2562
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 11. 25.
 */
public class Baekjoon_2562 {
	
	public static void main(String...args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 9개의 숫자 저장하기 위한 배열
		int[] num = new int[9];
		for(int i = 0; i < 9; i++){
			num[i] = Integer.parseInt(br.readLine());
		}
		// 최댓값, 그 위치 저장하기 위한 배열
		int[] max = new int[2];
		// 최댓값의 숫자 번호
		max[0] = 1;
		// 최댓값 초기화
		max[1] = num[0];
		for(int i = 1; i < num.length; i++){
			if(max[1] < num[i]){
				max[0] = i + 1;
				max[1] = num[i];
			}
		}
		System.out.println(max[1] + "\n" + max[0]);
	}
}
