package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean gender = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		System.out.print("성별 : ");
		
		if(gender) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
		System.out.println("나이 : " + age + "세");
		System.out.printf("키 : %.1f cm\n", height);
		System.out.printf("몸무게 : %.1f kg\n", weight);
		System.out.printf("혈액형 : %c 형\n", bloodtype);
	}

}
