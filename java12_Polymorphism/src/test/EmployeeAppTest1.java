package test;

import util.MyDate;
import vo.child.Manager;
import vo.parent.Employee;

public class EmployeeAppTest1 {
	
	public static void main(String[] args) {
		// Polymorphism ������� ��ü�� ����
		// �θ�Ÿ������ �ڽ� ��ü�� ����
		
		Employee e1 = 
				new Manager("111-111", "James", new MyDate(1900,1,1), 45000.0, "it");
		/*
		 * 	Virtual Method Invocation ������ ����� (�ڽ��� �޼ҵ尡 ��������� ����Ǿ���.)
		 * ::
		 * Compile Time Type - �θ�޼ҵ尡 ȣ�� ��.
		 * Runtime Type - �ڽ��� �޼Ұ� ȣ���.
		 * ::
		 * ���������, ��Ӱ��迡 �ִ� �ڽ� Ŭ�������� 
		 * �θ�Ÿ������ �ڽİ�ü�� ����������
		 * �������̵� �Ǿ��� �ִ� �޼ҵ忡�� �߻��Ѵ�.
		 */
		System.out.println(e1.getDetails()); // e1.getDetails(); �� Employee�� �޼ҵ带 ȣ���Ѱ���
		                                     // But, Manager��getDetails()�� �����.
		//e1.dept = "������";
		//Object Casting�� ����Ѵ�.
		/*
		 * dept�� Employee�� ���� �ʵ��̱� ��������,
		 * �޸𸮿� �ö� ���� �ʴ°��� �ƴϴ�.
		 * Manager�� �ҷ��� ã�ƾ� �Ѵ�.
		 * ::
		 * Object Casitng 
		 */
		
		Manager m = (Manager)e1; // Manager�� ĳ�����Ѵ�
				m.changeDept("������");
		
		System.out.println(e1.getDetails());
	}
	
}
		

/*
 * Polymorphism ���� ������� ��ü�� �����Ҷ�
 * ::
 * 1. Virtual Method Invocation
 * 2. Object Casting
 */




