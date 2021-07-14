package codes;

public class MainDrive {
	
	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.title = "원피스";
		b1.rentFee = 500;
		b1.limitAge = 15;
		
		Book b2 = new Book();
		b2.title = "먼나라 이웃나라";
		b2.rentFee = 1500;
		b2.limitAge = 5;
		
		User u1 = new User();
		u1.name = "전은형";
		u1.birthYear =1991;
		u1.point = 1000;
		
		boolean try1 = u1.rentBook(b1);		
		System.out.println(try1);
		
		User u2 = new User();
		u2.name = "박보검";
		u2.birthYear = 1993;
		u2.point = 50000;
		
		boolean try2 = u2.rentBook(b1);	
		System.out.println(try2);
		
		b1.printBookInfo();
		
		
		
		
		
	}

}
