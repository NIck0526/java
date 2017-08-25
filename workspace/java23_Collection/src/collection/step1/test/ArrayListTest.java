package collection.step1.test;

import java.util.ArrayList;
import java.util.List;

/*
 * List�� �ڽ����� ���� ���� ���Ǵ� ArrayList
 * ����Ÿ�� �����ϰ� / ����� ����Ÿ�� �ٽ� �����ϴ� ��ɵ��� ���
 * List ���������� Ư¡���δ�
 * ������ �����鼭 ���� | �ߺ��� ���
 */
public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("������");
		list.add("��ȿ��");
		list.add("����");
		list.add("������");
		//Collection������ toString()�� �������̵� �Ǿ��ִ�.
		//����Ÿ �������...
		System.out.println(list);//why �ּҰ�???
		System.out.println("1.list�� ����ִ� ����Ÿ�� ���� ::" +list.size());
		
		//1. �ι��� ����Ÿ�� ����
		list.remove(1);
		System.out.println("remove" +list);
		//2. ������ ����Ÿ�� ȿ���� ����
		list.set(2, "ȿ��");
		System.out.println("set"+list);
		//3. list �ȿ� ����Ÿ�� �ϳ��� �ִٸ� ��� ����Ÿ�� ����
		if(!list.isEmpty())
			list.clear();
		
		System.out.println("clear() "+list);
		//4. ù��° ����� �̸��� ���Ϲ޾Ƽ�
		list.add("KOSTA");
		String firstName = (String)list.get(0); //Object�� �����ϱ� ������ String���� �ٲ������
		System.out.println("ù���� �̸� get() "+firstName);
		// ù��° �̸��� ���
	}

}



/*
 * get() | add() | boolean remove(Object), remove(index) | set()
 * isEmpty() | size()
 * ��ü������ toString()�� ����Ÿ�� ������� �������̵� �Ǿ��ִ�.
 */

