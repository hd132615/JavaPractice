package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int S1a = 9, S1b = 10;
		double S1h = 5.8;
		
		int S2a = 9;
		double S2h = 5.4;
		
		double S1, S2;
		
		S1 = (S1a + S1b)*S1h/2;
		S2 = S2a*S2h;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + S1);
		System.out.println("평행사변형 넓이 : " + S2 + "\n");
		
		double result;
		result = S1 > S2 ? S1 - S2 : S2 - S1;
		
		if ( S1 > S2 ) {
			System.out.println("사다리꼴이 평행사변형 보다 " + result + "더 큽니다.");
		}
		else if ( S1 < S2 ) {
			System.out.println("평행사변형이 사다리꼴 보다 " + result + "더 큽니다.");
		}
		else {
			System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다.");
		}
	}
}
