/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   │_ Race
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 * 
 * @author		: 이상빈
 * @version		: 1.0
 */
public class Race2 {
	
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread r1 = new Thread(new Runner2("A"));
		Thread r2 = new Thread(new Runner2("B"));
		
		r1.setPriority(Thread.MAX_PRIORITY);
		r2.setPriority(Thread.MIN_PRIORITY);
	
		r1.start();
		r2.start();
	
		System.out.println("main thread end");
	}
}
