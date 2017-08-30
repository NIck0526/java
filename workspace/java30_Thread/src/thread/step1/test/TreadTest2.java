package thread.step1.test;

class GThread implements Runnable{
	int i = 0;
	
	@Override
	public void run() {
		while(true) {
			try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		} 
			System.out.println(Thread.currentThread().getName()+i++);
			if(i==20) break;
		}
	}
}


class CThread implements Runnable{
	int i = 0;
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
			e.printStackTrace();
			} // static 이라서 바로Thread로 이용가능
			System.out.println(	Thread.currentThread().getName()+i++);
			if(i==20) break;
		}
	}

}
public class TreadTest2 {

	public static void main(String[] args) {
		GThread g = new GThread();
		CThread c = new CThread();
		Thread t1 = new Thread(g);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
		
		

	}
}



