/*
 * Baekjoon_10809.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 11. 01
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * baekjoon #10809
 * https://www.acmicpc.net/problem/10809
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 11. 01.
 */
public class Baekjoon_10809 {
	public static void main(String...args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] charS = new char[100];
		int[] alphabet = new int[26];
		
		String s = br.readLine();
		charS = s.toCharArray();
		
		for(int i = 0; i < alphabet.length; i++){
			alphabet[i] = -1;
		}
		for(int i = 0; i < charS.length; i++){
			for(int j = 0; j < alphabet.length; j++){
				if((int)charS[i] ==	'a' + j){
					// 처음 나온 알파벳 위치를 저장하기 위해
					if(alphabet[j] != -1){
						break;
					} else{
						alphabet[j] = i;
					}
				}
			}
		}

		for(int i = 0; i < alphabet.length; i++){
			System.out.print(alphabet[i] + " ");
		}
	}
}