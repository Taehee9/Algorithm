/*
 * Baekjoon_1157.java
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
 * baekjoon #1157
 * https://www.acmicpc.net/problem/1157
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 11. 05.
 */
public class Baekjoon_1157 {

	public static void main(String...args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] charS = new char[100];
		int[] alphabet = new int[100];
		int max = 0;
		int maxIndex = 0;
		
		String s = br.readLine().toUpperCase();
		charS = s.toCharArray();
		
		for(int i = 0; i < charS.length; i++){
			alphabet[(int)charS[i]]++;
		}

		for(int i = 65; i < alphabet.length; i++){
			if(max < alphabet[i]){
				// 비교용 max
				max = alphabet[i];
				// 몇 번째 알파벳인지 알기 위함
				maxIndex = i;
			} else if(max == alphabet[i]){
				// 같은 숫자만큼 나온 알파벳이 제일 많이 출력된 문자일 때 
				if(maxIndex > 0){
					maxIndex = 11111;
				}
			}
		}
		// 같은 숫자만큼 나온 알파벳이 제일 많이 출력된 문자일 때 
		if(maxIndex == 11111){
			System.out.println("?");
		} else{
			System.out.println((char)maxIndex);
		}
	}

}

/*

제출 할 때의 기본 폼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}

}

*/
