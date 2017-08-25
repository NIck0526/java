package collection.step1.test;
/*
 * Set�� ����ũ�� ����Ÿ�� �����ϴ� Ư¡�� ����
 * ������ ����
 * ::
 * add() | boolean remove(object) |
 * ::
 * set() | get() �̾��� . ������ ��� 
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest3 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("��ȿ��");
		set.add("�̻��");
		set.add("������");
		set.add("�̻��");
		
		System.out.println(set); // ���������°� Ȯ�� �� �� ����. �ߺ��� ����.
		System.out.println("1. set�ȿ� ����ִ� ����Ÿ�� ���� ::"+set.size());
		
		//1. set�ȿ� �������� ����ִ����� ����
		
		System.out.println("2. �������� �ֳ���"+set.contains("������"));
		
		//2. ȿ���� �����ϼ���.
		System.out.println("3. ȿ�� ���� :"+set.remove("ȿ��"));
		
		//set.clear()
		//System.out.println(set);
		
		//3. �̾ƺ��� ... iterator()
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			}
	}
}