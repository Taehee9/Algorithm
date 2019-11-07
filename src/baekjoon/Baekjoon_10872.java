/*
 * Baekjoon_10872.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 11. 07
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

/**
 * baekjoon #10872
 * https://www.acmicpc.net/problem/10872
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 11. 07.
 */
public class Baekjoon_10872 {
	/**
	 * 팩토리얼 함수
	 * 2019. 11. 7., dhstoalfh9509@gmail.com
	 * @param num 팩토리얼 계산할 수
	 * @param dp 이전에 계산했던 값 저장하는 곳
	 * @return 팩토리얼 계산한 값
	 */
	public static Long factorial(int num, HashMap<Integer, Long> dp){
		if(dp.containsKey(num)){
			// 값이 있으면 꺼내오기
			return dp.get(num);
		} else if(num < 2){
			return (long) 1;
		} else{
			// 값을 저장하면서 계산
			long value = factorial(num-1, dp) * num;
			dp.put(num, value);
			return value;
		}
	}
	
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		HashMap<Integer, Long> dp = new HashMap<Integer, Long>();

		if(num >= 0 && num <= 12){
			System.out.println(factorial(num, dp));
		}
		scan.close();
		
	}
}