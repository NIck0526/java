package thread.step2.test;

import java.awt.Toolkit;

/*
 * step1
 * ::
 * ������� 5�� �߻� / ���ÿ� ������ ���ڸ� 5�� ���
 * �̶� ������ �����带 ������� �ʰ�
 * ���� main���� ó�� 
 * ::
 * main �޼ҵ尡 ����� �������� ����� �˰� �ִ�.
 * BeepThreadTest1��� �ϳ��� ���μ����� �����Ѵٴ� ����
 * �׾ȿ� �ݵ�� �ϳ��� �����尡 ���� �ִٴ� ���̴�.
 * ���� ������ �۾������带 ������ ���� ���̴�.
 * 
 */
public class BeepThreadTest1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
			}
			
			
		}// for
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
			}
		}
	}

}