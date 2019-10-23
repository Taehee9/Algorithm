/*
 * Baekjoon_2448.java
 * 
 * Author : taehee Kwon
 * Date : 2019. 10. 23
 * Contact : dhstoalfh9509@gmail.com
 */
package baekjoon;

import java.util.Scanner;

/**
 * baekjoon #2448
 * https://www.acmicpc.net/problem/2448
 * 
 * @author Taehee Kwon, dhstoalfh9509@gmail.com, 2019
 * @since  2019. 10. 23.
 */
public class Baekjoon_2448 {

	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int tcNum = scan.nextInt();
		for(int total = 0; total < (tcNum / 3); total++){			
			for(int i = 0; i < 3; i ++){
				for(int j = 2; j > i; j--){				
					System.out.print(" ");
				}
				for(int k = 0; k <= (i * 2); k++){
					if(i == 1 && k == 1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
		scan.close();
	}

}

/*
  	   				   *                        
	   				  * *                       
		  			 *****                      
		 			*     *                     
				   * *   * *                    
				  ***** *****                   
				 *           *                  
				* *         * *                 
	 		   *****       *****                
			  *     *     *     *               
			 * *   * *   * *   * *              
			***** ***** ***** *****             
		   *                       *            
		  * *                     * *           
		 *****                   *****          
		*     *                 *     *         
	   * *   * *               * *   * *        
	  ***** *****             ***** *****       
	 *           *           *           *      
	* *         * *         * *         * *     
   *****       *****       *****       *****    
  *     *     *     *     *     *     *     *   
 * *   * *   * *   * *   * *   * *   * *   * *  
***** ***** ***** ***** ***** ***** ***** *****

**/
