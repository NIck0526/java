package kosta.service.dice.play;

import kosta.service.dice.Dice;

public class Player02 {

	private int totalValue;
	private Dice dice;
	
	public Player02(Dice dice) {
		this.dice = dice;
		System.out.println("::"+getClass().getName()+"( )������ ȣ��...");
	}
	
	//getter() | setter() �� �ʵ��� ������ ���߾ �߰�
	public Dice getDice() {
		return dice;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}
	
	
	public int getTotalValue() {
		return totalValue;
	}

	//count ��ŭ �ֻ����� ������ ������ ������ ���ڸ� ���ϴ� ���.
	public void playDice(int count) {
		System.out.println("::"+getClass().getName()+".playDice() is calling....");
		
		for(int i=0; i<count; i++) {
			dice.selectedNumber();//
			System.out.println("::["+dice.getClass().getName()+" ]�� ���õ� �� :: "+dice.getValue());
			totalValue += dice.getValue();
		}//for
		System.out.println("::"+getClass().getName()+".playDice() was called...");
	}	
}//class









