/*
 * Baekjoon_3052.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 11. 27
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * baekjoon #3052
 * https://www.acmicpc.net/problem/3052
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 11. 27.
 */
public class Baekjoon_3052 {
	
	public static void main(String...args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[10];
		int[] count = new int[42];
		int result = 0;
		// 숫자 10개 입력받고 42로 나눈 나머지 저장
		for(int i = 0; i < num.length; i++){
			num[i] = Integer.parseInt(br.readLine()) % 42;
		}
		// num의 값 체크
		for(int i = 0; i < num.length; i++){
			count[num[i]]++;
		}
		// 1개라도 있으면 result 세기(각기 다른 나머지값들 몇 개인지 세기 위해)
		for(int i = 0; i < count.length; i++){
			if(count[i] > 0){
				result++;
			}
		}
		System.out.println(result);
	}
}
