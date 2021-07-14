package codes;

public class User {
	
//	사용자 - 멤버변수 : 이름, 출생년도, 보유포인트
//	메쏘드 - 나이계산기능(2021년 기준), 사용자정보출력, 책 대여하기
	
	String name;
	int birthYear;
	int point;

	
//	Q1. 2021년 기준의 한국 나이를 구하는 메쏘드 getKoreanAge를 만들자
	int getKoreanAge() {
		return 2021-birthYear+1;
	}
	
//	Q2. 사용자 정보 출력 기능 printUserInfo를 만들자
	void printUserInfo() {
		System.out.println("=================");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + getKoreanAge());
		System.out.println("포인트 : " + point + "P");
		System.out.println("=================");		
	}

}
