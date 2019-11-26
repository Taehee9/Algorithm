/*
 * Baekjoon_2577.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 11. 26
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * baekjoon #2577
 * https://www.acmicpc.net/problem/2577
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 11. 26.
 */
public class Baekjoon_2577 {
	public static void main(String...args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mul = 1;
		// 입력받은 숫자 3개 곱하기
		for(int i = 0; i < 3; i++){
			mul *= Integer.parseInt(br.readLine());
		}
		
		// int -> string 한 후 배열로 저장
		char[] mulArray = Integer.toString(mul).toCharArray();
		int[] num = new int[10];
		
		for(int i = 0; i < mulArray.length; i++){
			// char의 1은 int 1이 되려면 48을 빼야함
			num[(mulArray[i] - 48)]++;
		}
		// 0부터 9까지의 숫자가 각각 몇 번 이었는지
		for(int i = 0; i < num.length; i++){
			System.out.println(num[i]);
		}
	}
}