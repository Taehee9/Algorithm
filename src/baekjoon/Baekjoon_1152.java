/*
 * Baekjoon_1152.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 11. 05
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * baekjoon #1152
 * https://www.acmicpc.net/problem/1152
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 11. 05.
 */
public class Baekjoon_1152 {

	public static void main(String...args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		// 앞뒤 공백 지우고 띄어쓰기를 기준으로 문자를 나누기
		String[] word = s.trim().split("\\s");

		// 빈칸만 입력했을 때 1이 나오는 것을 방지하기 위해
		if(word[0].equals("")){
			System.out.println("0");
		} else{
			System.out.println(word.length);
		}
	}

}