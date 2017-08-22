package kosta.service.dice.test;

import kosta.service.dice.impl.DiceAImpl;
import kosta.service.dice.impl.DiceBImpl;
import kosta.service.dice.impl.DiceCImpl;
import kosta.service.dice.play.Player01;
import kosta.service.dice.play.Player02;

public class DiceTestApp02 {

	public static void main(String[] args) {

		Player02 player01 = new Player02(new DiceAImpl());
		player01.playDice(3);
		System.out.println("+================================");
		System.out.println("���õ� �ֻ��� �� �� :: "+player01.getTotalValue());
		
		Player02 player02 = new Player02(new DiceBImpl());
		player02.playDice(3);
		System.out.println("+================================");
		System.out.println("���õ� �ֻ��� �� �� :: "+player02.getTotalValue());
		
		Player02 player03 = new Player02(new DiceCImpl());
		player03.playDice(3);
		System.out.println("+================================");
		System.out.println("���õ� �ֻ��� �� �� :: "+player03.getTotalValue());
		
		
		
		

	}

}