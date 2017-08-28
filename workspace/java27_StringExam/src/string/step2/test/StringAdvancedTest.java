package string.step2.test;

import java.util.HashSet;
import java.util.Scanner;

public class StringAdvancedTest {

	public static void main(String[] args) {
		String[] files = {
				"Begin Again.avi",
				"StringTest1.java",
				"August Rush.mp3",
				"���.avi",
				"rt.jar"				
		};
		
		String stars = "�ں��� ������ ������ �ں��� Ŭ��� ������ ������";
		StringService service = new StringService();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϸ��� ��µǱ⸦ ���ϴ� Ȯ���ڸ� ���� �Է��ϼ���...\n");
		String extention = sc.nextLine();
		
		service.printFileName(files, extention);
		System.out.println(service.getUniqueStar(stars));
	}
	

}



class StringService{
	public void printFileName(String[] files, String extention) {
		/*
		 * �����ϼ���...
		 * 1. files�� ����ִ� ���� �߿��� Ȯ���ڰ� �Էµ� �Ͱ� ������(?)
		 * ���� �ִٸ� �׿� �ش��ϴ� ���ϸ��� �����ؾ� �Ѵ�.
		 * (�̶� Ȯ���ڴ� �����ϰ� ���ϸ���)
		 */
		for(String f : files) {
			if(f.endsWith(extention)) {
				System.out.println(f.replace("."+extention, ""));
			}
		}
		
		
	}//
	
	public HashSet<String> getUniqueStar(String stars){
		HashSet<String> set = new HashSet<String>();
		String[ ] starArr=stars.split(" ");
		for(String s : starArr) {
			set.add(s);
		}
		/*
		 * stars�� �޾Ƽ� ������ �������� �ڸ���.
		 * �̶� �ߺ��Ǵ� �̸��� �����ϰ�
		 * star���� Set�� �����ϰ� Set�� �����Ѵ�.
		 */
		return set;
	}
}

