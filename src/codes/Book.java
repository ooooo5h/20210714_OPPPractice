package codes;

public class Book {
	
	String title;
	int rentFee;
	int limitAge;
	
//	Q1. 빌려간 사람이 누군지 만들자
	User rentUser;
	
//	Q2. 책의 정보 출력 기능
	void printBookInfo() {
		System.out.println("==============");
		System.out.println("책 제목 : " + title);
		System.out.println("대여료 : " + rentFee);
		System.out.println("연령제한 : " + limitAge);
		System.out.println("==============");
	}
	
	

}
