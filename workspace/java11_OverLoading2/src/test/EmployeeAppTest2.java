package test;

import util.MyDate;
import vo.parent.Employee;

public class EmployeeAppTest2 {
	public static void main(String[] args) {
		
		/*
		//1. Employee Ŭ������ ����...e...���ڰ� 4
		Employee e = new Employee("111-111", "������", new MyDate(1980,1,3), 300000.0);
		Employee e1 = new Employee("777-777");
		//2. Manager Ŭ������ ����...m...���ڰ� 5
		Manager m = new Manager("222-222", "�̻��", new MyDate(1980,3,4), 550000, "������");
		*/
	
		Employee Manager = new Employee("222-222", "�̻��", new MyDate(1980,3,4), 550000, "������");
		Employee Enginer = new Employee("333-333", "��ȿ��", new MyDate(1981,3,5), 600000, "����");
		Employee Secretary = new Employee("444-444", "������", new MyDate(1982.3.6), 700000, "Ʈ����");
		
		
		/*
		//3. e�� ������ ���...getDetails()
		System.out.println(e.getDetails());
		System.out.println(e1.getDetails());
		//4. m�� ������ ���...getDetails()
		System.out.println(m.getDetails());
		*/
		/*m.getDetails("��ȹ��");
		
		m.getDetails(Employee.DEFAULT_SALARY);
		*/


	}
}