/*
 * Baekjoon_2748.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 10. 25
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

/**
 * baekjoon #2748
 * https://www.acmicpc.net/problem/2748
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 10. 25.
 */
public class Baekjoon_2748 {
	public static long fn_fibonacci(int num, HashMap<Integer, Long> dp){
		if(dp.containsKey(num)){
			return dp.get(num);
		} else if(num == 0){
			return 0;
		} else if(num <= 2){
			return 1;
		} else{
			long value = fn_fibonacci(num-1, dp) + fn_fibonacci(num-2, dp);
			dp.put(num, value);
			return value;
		}
	}
	
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		// 90일 때의 답 범위가 int를 넘어가기 때문에 자료형을 long으로 설정
		HashMap<Integer, Long> dp = new HashMap<Integer, Long>();
		
		if(num >0 && num <= 90){
			System.out.println(fn_fibonacci(num, dp));
		}
		scan.close();
	}
}
