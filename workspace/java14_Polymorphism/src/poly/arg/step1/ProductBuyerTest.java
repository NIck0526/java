package poly.arg.step1;

public class ProductBuyerTest {
	public static void main(String[] args) {
		TV tv= new TV();
		Computer com = new Computer();
		ProductBuyer buyer = new ProductBuyer();
		
		buyer.buyTV(tv);
		buyer.buyComputer(com);
		System.out.println("���� ���� �ݾ��� "+buyer.money);
		System.out.println("���� ������ ����Ʈ�� "+buyer.bonusPoint);

	}

}
//super class
class Product{
	int price;
	int bounsPoint;
	
	//��ǰ�� ��������� �׋� ���ݵ� �Բ� ������.
	//�̶� ���ʽ��� �Բ� ������.(��ǰ���� 10%)
	Product(int price){
		this.price = price;
		bounsPoint = (int)(price/10);
		
	}
}//product

//sub class
class TV extends Product{
	TV(){
		super(150);
	}
	@Override
	public String toString() {
		return "TV";
	}
}//TV

//sub class
class Computer extends Product{
	Computer(){
		super(100);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}//computer

//service Class
class ProductBuyer{
	int money = 1000; // ��õ������ ������ ����.
	int bonusPoint = 0; //���� ����Ʈ�� 0 (������ ������ ����.)
	
	public void buyTV(TV tv) {
		/*
		 * ���� ������ ������ ������ �۰ų�, �������� ����ִ�.
		 * ��ǰ�� ���ݸ�ŭ ���� ������ / 
		 * ��ǰ���� 10%��ŭ ���ʽ�����Ʈ�� �ö󰡰�
		 * ���������� ������ ������ ������ ���
		 */
		if(money<=tv.price) {
			System.out.println("�ܾ��� �����ؼ� ���Ǳ����� �ȵ˴ϴ�.");
			return;//buyTV�� ȣ���� ������ �ǵ�����.
		}
		//��ǰ ��� ������ ����
		money -=tv.price;
		bonusPoint +=tv.bounsPoint;
		System.out.println(tv+"��(��) �����ϼ̽��ϴ�. ��������");
	}//buyTV
	
	public void buyComputer(Computer com) {
		/*
		 * ���� ������ ������ ������ �۰ų�, �������� ����ִ�.
		 * ��ǰ�� ���ݸ�ŭ ���� ������ / 
		 * ��ǰ���� 10%��ŭ ���ʽ�����Ʈ�� �ö󰡰�
		 * ���������� ������ ������ ������ ���
		 */
		if(money<=com.price) {
			System.out.println("�ܾ��� �����ؼ� ���Ǳ����� �ȵ˴ϴ�.");
			return;//buyComputer�� ȣ���� ������ �ǵ�����.
		}
		//��ǰ ��� ������ ����
		money -=com.price;
		bonusPoint +=com.bounsPoint;
		System.out.println(com+"��(��) �����ϼ̽��ϴ�. ��������");
	}
	
}

/*
 * ������
 * ::
 * 1. buyTV(tv), buyComputer(com)
 *  �ذ���->
 *  buyProduct(tv), buyProduct(com) - Overloading �����Ѱ��� �̰���. �׷��� ��� ���ڰ��� �ٲ������.
 *  �ذ��� 2->
 *  buyProduct(Product p){
 *   if(p instanceof TV)
 *   if(p instanceof Computer)
 *   -Polymorphic argument ������ ��.
 */
















