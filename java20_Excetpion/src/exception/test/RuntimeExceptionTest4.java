package exception.test;

public class RuntimeExceptionTest4 {

	public static void main(String[] args) {
		System.out.println("========NullPointerException========");
		String str = new String("KOSTA");
		//String str = "KOSTA"; ���� ���̿�
		str = null;
		try {
		System.out.println("str ���ڿ��� ���� ::"+str.length());
		System.out.println("str �ּҰ� :: "+str.toString());//Overriding
		}catch(Exception e) {
			//System.out.println("��Ҵ�!2"); 
			e.printStackTrace();                  //�� ������ ������� ������ִ� ��
			//System.out.println(e.getMessage()); �̰� �� �Ⱦ� �� ������ ������ �ڼ��� �� �˷���.
		}	
			
			// Exception�� �θ𿩼� ������ ��Ҵµ�
		    //�� �� ���� ������ Nullpointer�� �ͼ� ������ ��� ��������.
		
		
		/*catch(NullPointerException e) {
			System.out.println("��Ҵ�!");
		}*/

	}

}

/*
 * catch�� ������ �����ϴ�.
 * ������ ������ �߿��� �ϳ��� �������� �������� ���� �ȵȴ�.
 * e.printStackTrace() | e.getMessage()
 */




