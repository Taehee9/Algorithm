/*
 * Baekjoon_2751.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 12. 05
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * baekjoon #2751
 * https://www.acmicpc.net/problem/2751
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 12. 05.
 */
public class Baekjoon_2751{
	// 힙 정렬로도 풀어보기
	public static void main(String...args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < tc; i++){
			list.add(Integer.parseInt(br.readLine()));
		}
		list.sort(null);
		for(int i = 0; i < tc; i++){
			System.out.println(list.get(i));
		}
	}

}
