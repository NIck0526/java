package fly.impl;

import fly.Flyer;

//sub class... �ݵ�� ��������� å���� �ִ�.
public class Bird implements Flyer {
	
	private String kind;
	
	
	@Override
	public String fly() {
		return "���� ����.";
		
	}

	@Override
	public void take_off() {
		System.out.println("���� �̷��Ѵ�.");
		
	}

	@Override
	public void land() {
		System.out.println("���� �����Ѵ�.");
		
	}
	//Bird���� ���
	/*
	 * final :: "���� �������̾�~~~!!;
	 * �޼ҵ� �� ' ���� ������ �޼ҵ�� : �������̵� ����
	 * ������ - " ���� ������ ������ " ����� �ǹ�
	 * Ŭ������ = "���� ������ Ŭ������"
	 */
	public String layEggs(String kind) {
		return kind+"���� ���";
	}

}