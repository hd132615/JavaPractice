/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   │_ PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * @author		: 이상빈
 * @version		: 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember[] family = {
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("남동생"),
				new FamilyMember("나")
		};
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(family[0], 10000);
		PiggyBank.putMoney(family[1], 5000);
		PiggyBank.putMoney(family[2], 2000);
		PiggyBank.putMoney(family[3], 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(family[2], 1000);
		PiggyBank.printBalance();
		PiggyBank.stealMoney(family[2], 3000);
		PiggyBank.printBalance();
	}

}
