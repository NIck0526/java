package thread.step2.test;
/*
 * step2
 * ::
 * Beep ������� "��" �����
 * ���ÿ� ����ǵ��� ������ �۾������带 �ۼ�
 * ::
 * main ������� �۾� �����尡 ���������� ó���Ǵ� ������ Ȯ��
 * 
 */
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

class BeepThread extends Thread{
	public void run() {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i=0; i<5; i++) {
		toolkit.beep();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		
		}
		
		
	}// for
	}
}
public class BeepThreadTest2 {
	public static void main(String[] args) {
		BeepThread beep = new BeepThread();
		beep.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
			}
		}//
	}

}