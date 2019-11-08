/*
 * Baekjoon_10870.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 11. 08
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * baekjoon #10870
 * https://www.acmicpc.net/problem/10870
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 11. 08.
 */
public class Baekjoon_10870 {
	// 피보나치 함수
	public static long fibonacci(int num, HashMap<Integer, Long> dp){
		if(dp.containsKey(num)){
			return dp.get(num);
		} else if(num == 0){
			return 0;
		} else if(num < 2){
			return 1;
		} else{
			long result = fibonacci(num-1, dp) + fibonacci(num-2, dp);
			dp.put(num, result);
			return result;
		}
	}
	
	public static void main(String...args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int tcNum = scan.nextInt();
		HashMap<Integer, Long> dp = new HashMap<Integer, Long>();
		
		if(tcNum >= 0 && tcNum <= 20){
			System.out.println(fibonacci(tcNum, dp));
		}
		scan.close();
	}
}