package user.exception;

class UnderAgeException extends Exception{
	UnderAgeException(String cut){
		super(cut);
	}
	
	UnderAgeException(){
		this("This is a UserException");
	}	
}





 class AdultMovie {
	public void enter(int age) throws UnderAgeException{
		/*
		 * ���
		 * ���࿡ ���̰� 19�� �̻��̸� ����...
		 * �׷��� �ʴٸ� ��ź��Ʈ����(UnderAgeException)
		 */
		if(age>=19) {
			System.out.println("��ǥ�ҿ��� ǥ�� �˻��մϴ�.");
			System.out.println("������~~~");
		}else {
			throw new UnderAgeException("���̰� �����");
		}
		
		
	}

}


public class AdultMovieTest2{
	public static void main(String[] args) {
		
		AdultMovie movie = new AdultMovie();
		System.out.println("���忡 ����.");
		try {
		movie.enter(18);
		}catch(UnderAgeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
