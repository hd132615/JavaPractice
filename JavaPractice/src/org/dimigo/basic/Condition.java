package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String car = "고속버스";
		int distance = 25;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		
		int price, i = 1;
		
		switch(car) {
		case "고속버스":
			price = 850;
			
			while(true) {
				if(distance <= i*10) {
					price += 300*(i-1);
					break;
				}
				
				i++;
			}
			
			break;
		case "경차":
			price = 300;
			
			while(true) {
				if(distance <= i*10) {
					price += 200*(i-1);
					break;
				}
				
				i++;
			}
			
			break;
		default:
			price = 600;
			
			while(true) {
				if(distance <= i*10) {
					price += 200*(i-1);
					break;
				}
				
				i++;
			}
		}
		
		System.out.println("통행료 : " + price + "원");
	}

}
