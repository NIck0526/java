package ch11_30;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
	public static void main(String []args) {
		HashMap map = new HashMap();
		map.put("lee26", "1234");
		map.put("mika0526","12345");
		map.put("lee26", "12345"); // �� �ڿ����� �°���?
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID�� ����� �Է����ּ���");
			System.out.println("I D : ");
			String id = sc.nextLine().trim();
			
			System.out.println("�� �� �� ȣ : ");
			String password = sc.nextLine()	.trim();
			System.out.println();
			
			
			if(!map.containsKey(id)) {
				System.out.println("�Է� �Ͻ� I D�� �������� �ʾƿ�~"+"\n �ٽ� �Է������~");
				continue;
			}else {
				if(!map.get(id).equals(password)) {
					System.out.println("��й�ȣ�� ��ġ ���� �ʾ�! �ٽ� �Է���");
				}else {
					System.out.println(" �α��� �Ǿ����ϴ�.");
					break;
				}//last else
			}//else
			
		}//while
	}

}