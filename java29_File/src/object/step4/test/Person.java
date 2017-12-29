package object.step4.test;
/*
 * ================= Serializable ==============
 * Person Ŭ������ ��ü�� ��Ʈ���� ���ؼ� �������� �����Ϸ��� �ҋ�
 * ���޵Ǵ� ��ü�� ��ü�� �ʵ尪�� �ȴ�.
 * Ŭ������ �޼ҵ�� ����ȭ�� ��󿡼� ���ܵȴ�.
 * ::
 * Person Ŭ������ ���� ��Ʈ���� ����Ϸ���
 * �ش� Ŭ������ Serializable �̶�� �������̽��� �����������ν� 
 * ����ȭ�� ����������.
 * ::
 * Person�� Ŭ������ ���� ����ȭ�ȴٴ� ����
 * �ʵ尪�� ����Ʈ�� ��ȯ�Ǿ ��µǴ� ���� �ǹ��Ѵ�.
 * ::
 * transient
 * ��Ʈ���� ����ϴ� �ʵ��� ���߿��� ���Ȼ� ���޵Ǹ� �ȵǴ� ���� ���ԵǾ� ���� �� �ִ�.
 * password�� �ش�Ǵ� ���ε�,,,���� �Ⱥ������� �ǵ��ε�
 * 
 */
import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age;
	private transient String password;
	private String address;
	
	
	public Person(String name, int age, String password, String address) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", password=" + password + ", address=" + address + "]";
	}
	
}