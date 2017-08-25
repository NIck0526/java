package collection.step2.vo;

import java.util.Collection;
import java.util.HashMap;

public class CustomerMapTest {
	public static void main(String[] args) {
		HashMap<Integer, Customer> map = new HashMap<Integer, Customer>();
		map.put(111, new Customer(111, "��ȿ��", 35));
		map.put(222, new Customer(222, "�̻��", 37));
		map.put(333, new Customer(333, "������", 39));
		
		System.out.println(map.get(222));
		/*
		 * id���� 111�� ��ü�� ã�Ƽ� �� ����� �̸��� ���
		 */
		
		/*
		1��°���
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int id = it.next();
			Customer custom = map.get(id);
			if(custom.getCustId()==111)
				System.out.println("ID �� 111�� ����� �̸� : "+custom.getName());
		}*/
		
		//2���� ���
		/*Collection<Customer> collection = map.values();
		for(Customer c : collection)
			if(c.getCustId()==111)
				System.out.println("ID �� 111�� ����� �̸� : "+c.getName());*/
		
		//3���� ���
		
		/*Set<Entry<Integer, Customer>> s = map.entrySet();
		Iterator i =s.iterator();
		while(i.hasNext()) {
			Map.Entry e = (Entry)i.next();
			Customer custom = (Customer)e.getValue();
			if(custom.getCustId()==111);
			System.out.println("ID�� 111�� ����� : "+custom.getName());*/
		
		//3. ������ ������ ������ ���ϰ� ��տ����� ���
		
		int custAllAge = 0;
		Collection<Customer> coll = map.values();
		for(Customer c : coll)
			custAllAge += c.getAge();
		System.out.println("��� ���� : "+custAllAge/map.size());
		
	}
}

