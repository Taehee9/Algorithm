/*
 * Baekjoon_2908.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 11. 05
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.Scanner;

/**
 * baekjoon #2908
 * https://www.acmicpc.net/problem/2908
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 11. 05.
 */
public class Baekjoon_2908 {

	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		
		String txt = scan.nextLine();
		String[] strArray = txt.split("\\s");
		StringBuffer num1 = new StringBuffer(strArray[0]);
		StringBuffer num2 = new StringBuffer(strArray[1]);
		
		int reverseNum1 = Integer.parseInt(num1.reverse().toString());
		int reverseNum2 = Integer.parseInt(num2.reverse().toString());
		
		if(reverseNum1 < reverseNum2){
			System.out.println(reverseNum2);
		} else{
			System.out.println(reverseNum1);
		}
		
		scan.close();
	}

}
