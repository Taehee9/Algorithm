/*
 * Baekjoon_8958.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 11. 28
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * baekjoon #8958
 * https://www.acmicpc.net/problem/8958
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 11. 28.
 */
public class Baekjoon_8958 {
	
	public static void main(String...args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		char[][] charNum = new char[tc][80];
		int[][] point = new int[tc][80];
		for(int i = 0; i < tc; i++){
			// 입력받은 문자열 하나하나 저장하기 
			charNum[i] = br.readLine().toCharArray();
		}
		for(int i = 0; i < tc; i++){
			for(int j = 0; j < charNum[i].length; j++){
				// O면 1점 X면 0점(초기값)
				if(charNum[i][j] == 'O'){
					point[i][j] = 1;
				} else{
					point[i][j] = 0;
				}
				// 앞의 문자가 O이면 포인트 점점 증가하는 형식 (1 2 3 이런식)
				if(j > 0){
					if(charNum[i][j-1] == 'O'){
						if(charNum[i][j] == 'O'){
							point[i][j] = point[i][j-1] + 1;
						}
					}
				}
			}
		}
		// point 다 더한 후 출력
		for(int i = 0; i < tc; i++){
			for(int j = 0; j < point[i].length-1; j++){
				point[i][0] += point[i][j+1];
			}
			System.out.println(point[i][0]);
		}
	}
}
