/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   │_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 * 
 * @author		: 이상빈
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = "김소은";
		String a2 = "졸림";
		String a3 = "서든어택";
				
		System.out.println("가장 좋아하는 연예인은?");
		
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		
		if (a1.equals(answer)) {
		System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}
		
		System.out.println("지근 느끼는 감정은?");
		
		answer = scanner.nextLine();
		
		if (a2.equals(answer)) {
			System.out.println("정답입니다!! ^^");
			} else {
				System.out.println("틀렸습니다!! ㅠ");
			}
		
		System.out.println("가장 좋아하는 게임은?");
		
		answer = scanner.nextLine();
		
		if (a3.equals(answer)) {
			System.out.println("정답입니다!! ^^");
			} else {
				System.out.println("틀렸습니다!! ㅠ");
			}
	}
}
