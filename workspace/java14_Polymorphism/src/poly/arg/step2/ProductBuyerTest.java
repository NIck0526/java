package poly.arg.step2;

public class ProductBuyerTest {
	public static void main(String[] args) {
	/*	TV tv= new TV();
		Computer com = new Computer();*/
		
		//��ü���� 
		Product tv = new TV();
		Product com = new Computer();
		Product audio1 = new Audio();
		Product audio2 = new Audio();
		
		
		ProductBuyer buyer = new ProductBuyer();
		
		// �ѹ�
		tv.setpNumber(111);
		com.setpNumber(222);
		audio1.setpNumber(333);
		audio2.setpNumber(444);
		
		//��ǰ�� 4�� �����Ѵ�
		buyer.buyProduct(tv);
		buyer.buyProduct(com);
		buyer.buyProduct(audio1);
		buyer.buyProduct(audio2);
		
		buyer.summary();
		System.out.println(" ���� �ܾ�: "+buyer.money+" ����");
		System.out.println(" ���� ����Ʈ: "+buyer.bonusPoint+" ��");
		
		//ȯ��
		buyer.refund(audio1);
		System.out.println(" ���� �ܾ�: "+buyer.money+" ����");
		System.out.println(" ���� ����Ʈ: "+buyer.bonusPoint+" ��");
	}

}
//super class
class Product{
	int price;
	int bonusPoint;
	int pNumber; // ��ǰ�� �����ϴ� ����ũ�� ��.
	
	//��ǰ�� ��������� �׋� ���ݵ� �Բ� ������.
	//�̶� ���ʽ��� �Բ� ������.(��ǰ���� 10%)
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10);
		
	}

	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
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

class Audio extends Product{
	Audio(){
		super(80);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}//Audio

//service Class
class ProductBuyer{
	int money = 1000; // ��õ������ ������ ����.
	int bonusPoint = 0; //���� ����Ʈ�� 0 (������ ������ ����.)
	
	Product[] items = new Product[10]; // ������ ��ǰ���� �����ϴ� �����Ǻ����� (â�� or īƮ)
	int index = 0; //�迭 ���� ������ index�� �̸� �����Ѱ���.
	
	public void buyProduct(Product p) { //���� �ϳ���� ����ϰ� �ϳ� ��� ����ϰ�, or ���� ��ä �ѹ��� ����Ϸ��� Product[] p ���ڰ��� �������
		//items�� ��ǰ�� ��´�.
		if(money<p.price) {
			System.out.println("���� ���̤̤̤̤̤̤̤ۤ�?");
			return;
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		items[index++] = p; // ��Ʈ ������ �κп� ����.
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
		
	}
	
	public void refund(Product p) {
		//ȯ�� �ϰ��� �ϴ� pNumber�� ���ٸ� �ش� p�� ����
		for(int i=0; i<items.length; i++) {
			if(p.getpNumber()==items[i].getpNumber()) {
				//i��°�� �ش��ϴ� ��ǰ�� �ڿ� ��ǰ�� ��� �����.(�����ϴ°�)
				for(int j=1; j<items.length-1; j++) 
					items[j] = items[j+1]; 
				
				break;
				
			}//if
		}//for
		//���� ����� Ȯ���ϴ� ����
		System.out.println("================");
		for(int k=0; k<items.length; k++) {
			System.out.println(items[k]);
		}
		
		money +=p.price;
		bonusPoint -= p.bonusPoint;
		System.out.println(p+"��(��) ȯ��ó�� �ϼ̽��ϴ�.");
	}
	
	public void summary() {
		/*
		 * for ���� ���鼭 ������ ������ ���հ� �� ����� ���
		 */
		int sum = 0;
		String itemList = " ";
		
		for(Product p : items ) {
			if(p==null) break;
			sum +=p.price; // ����
			itemList += p+" ";
		}//for
		System.out.println("������ ��ǰ�� �� �ݾ�  : "+sum+" ����");
		System.out.println("������ ��ǰ�� �� ��� : "+itemList+" ...");
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
















