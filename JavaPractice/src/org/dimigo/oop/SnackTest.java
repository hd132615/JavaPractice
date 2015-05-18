/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   │_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 18.
 * </pre>
 * 
 * @author		: 이상빈
 * @version		: 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		
		Snack[] snackArr = {
				new Snack ("새우깡", "농심", 1100, 2),
				new Snack ("콘칩", "크라운", 1200, 1),
				new Snack ("허니버터칩", "해태", 1500, 4)
		};
		
		for(Snack snack : snackArr ) {
			snack.printSnack();
			
			result += snack.calcPrice() * snack.getNumber();
		}
		
		System.out.println("총 구매 금액 : " + String.format("%,d", result) + "원");
	}

}
