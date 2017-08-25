package collection.step2.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import collection.step2.vo.Person;

public class PersonListTest {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person ("������1",24,"���ǵ�"));
		list.add(new Person ("�̻��1",26,"����"));
		list.add(new Person ("��ȿ��1",74,"���ǵ�"));
		list.add(new Person ("���缮1",41,"�λ�"));
		list.add(new Person ("��ȣ��1",53,"����"));
		
		//1. list�� ����� ����� ����?
		System.out.println("===1. ����� ���� ? :: "+ list.size());
		
		//2. ù��° ����� ����� ã�Ƽ� �� ����� �ּҸ� ���
		System.out.println("===2. ù���� ����� �ּ� :: "+list.get(0).getAddress());
		
		//3. ��� ����� ������ ��
		int total=0;
		for(Person p : list)
			total += p.getAge();
			
		System.out.println("===3. ������ �� :: "+total);
		
		//4. ��տ���
		System.out.println("===4. ��� ���� :: "+total/list.size());
		
		//5. ������ �ּ�(���ǵ�)�� ��� ����� ��������� ���ϰ� 
		//�ش� �ּҿ� ��� ����� ������ ���
		int count = 0 ;
		for(Person p : list)
			if(p.getAddress().equals("���ǵ�")) {
				count++;
				System.out.println(p);
			}
		
		System.out.println("���ǵ��� �����ϴ� ����� "+count+" ��");
    }

}