/*
 * Baekjoon_1003.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 10. 18
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

/**
 * baekjoon #1003
 * 피보나치를 호출했을 때 0과 1이 몇 번 호출되는지 구하라.
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 10. 18.
 */
public class Baekjoon_1003 {
	static int zero = 0;
	static int one = 0;
	public static int fn_fibonacci(int n, HashMap<Integer, Integer> dp){
		// 이미 연산했던 적이 있다면 그 값을 꺼내 돌려준다
		if(dp.containsKey(n)){
			return dp.get(n);
		} else if(n == 0){
			zero ++;
			return 0;
		} else if(n <= 2){
			one ++;
			return 1;
		} else{
			int value = fn_fibonacci(n-1, dp) + fn_fibonacci(n-2, dp);
			dp.put(n, value);
			return value;
		}
	}
	public static void main(String...args) {
		HashMap<Integer, Integer> dp = new HashMap<Integer, Integer>();
		Scanner scan = new Scanner(System.in);
		// 테스트 케이스 개수
		int t = scan.nextInt();
		int b = 0;
		for(int i = 0; i < t; i++){
			zero = 0;
			one = 0;
			b = scan.nextInt();
			fn_fibonacci(b, dp);
			System.out.println(zero + " " + one);
		}
		scan.close();
	}

}

/*
 * dp.get, dp.put 말고 배열로 메모리제이션 하는 방법 있음
 * 찾아보고 메모리제이션 방법으로 처리하기
 * dp.get 이건 따로 정리하기
 */