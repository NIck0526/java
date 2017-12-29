package object.step4.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * =============== ����ȭ �ڵ� =============
 * 
 * Person ��ü�� �ʵ� ���� sink(���� : person.obj)������ ������ ������ �ۼ�
 * 1. Stream ����
 * 	  ObjectOutputStream | FileOutputStream
 *
 * 2. ����Ѵ�... WriteObject(person);
 * 3. �ڿ��� �ݴ´�.
 * 
 */
public class PersonObjectOutputTest {

	public static void main(String[] args) throws Exception {
		String fileName = "c:\\objFile\\person.obj";
		File f = new File(fileName);
		f.getParentFile().mkdirs();
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("1. Stream ����....");
		
		Person p = new Person("ȫ�浿", 20, "1234", "���ǵ�");
		
		oos.writeObject(p);
		System.out.println("2.writeObject()  calling....");
		System.out.println("3. person.obj ���Ͽ� person�� ������ �������ϴ�...");
		System.out.println("4. ������ Ȯ���غ����� �ٽ� ������ȭ �ؼ� ����غ��ϴ�...");
		
		oos.close();
	}

}