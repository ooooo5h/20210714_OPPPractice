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
	
//	Q3. 책 대여하기 기능
	boolean rentBook(Book book) {
		
//		1)빌려간 돈이 충분한가?
//		2)빌려갈 수 있는 나이인가?
//		3)빌려간 사람이 없는가?
//		-> 3가지 모두 통과해야 대여 가능
		boolean isPointOk = point >= book.rentFee;
		boolean isAgeOk = getKoreanAge() >= book.limitAge;
		boolean rentAvailable = book.rentUser == null;
		
		
//		모두 통과해야 대여 가능
//		대여하고 나면, 해당 사용자를 책 빌려간 사람으로 등록
//		해당 사용자의 포인트도 대여료만큼 차감
//		빌려간 사람이 있다면 그사람의 이름 표시 
//		없다면 대여 가능상태입니다 문구 표시
		if(isPointOk && isAgeOk && rentAvailable) {
//			System.out.println("대여 가능합니다.");	
			
//			책을 사용자에게 대여 처리 => 책을 빌려간 사람이 나다
			book.rentUser = this;
			
//			빌려간 사람의 포인트를 대여료만큼 차감
			book.rentUser.point -= book.rentFee;
			
			return true;
		}
		else {
			System.out.println("대여불가합니다.");
//			System.out.println(book.rentUser + "가 이미 대여중입니다.");
			
			return false;
		}
		
		
		
		
		
		

	}

}
