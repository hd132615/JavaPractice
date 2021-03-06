/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   │_ Figure
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 * 
 * @author		: 이상빈
 * @version		: 1.0
 */
public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure() { }
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return (centerX * centerY);
	}
	
	protected void printCenter() {
		System.out.println("중심좌표 : " + "(" + centerX +", " + centerY + ")");
	}
	
	protected void moveFigure() {
		centerX += 5;
		centerY += 5;
	}
}
