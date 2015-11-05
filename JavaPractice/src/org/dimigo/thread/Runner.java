/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   │_ Runner
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 * 
 * @author		: 이상빈
 * @version		: 1.0
 */
public class Runner extends Thread{
	
	private String name;

	public Runner() {}
	
	/**
	 * @param name
	 */
	public Runner(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + " 출발");
		
		for(int i = 10; i >= 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name + " " + i*10 + " 미터");
		}
		
		System.out.println(name + " 골인");
	}
}
