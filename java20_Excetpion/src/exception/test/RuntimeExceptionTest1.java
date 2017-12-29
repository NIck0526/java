package exception.test;
/*
 * 1. �������� �ȴ�.( �����Ϸ��� ���ܸ� �ν����� ���Ѵ�)
 * 2. ArrayIndexOutOfBoundsException�� �߻� --> RuntimeException
 * 3. method block{ �ȿ��� ���ܴ� �� ������ �߻��Ѵ�.(���� �Ǵ°� ����)
 * 4. ������ ��� 4 ��° �ٿ��� ���װ� �߻������Ƿ� ������ ���ᰡ �Ǿ���.
 * 5. �ذ�å ::
 *    ����ó���� ���������� ���ָ� �ȴ�.
 *    try, catch, throws ���� Ű���尡 �ִ�.
 *    ��, Runtime �迭�� ���� ���� �׷� �ʿ䰡 ����,
 *    �ҽ� �ڵ带 �ٷ� �����ϸ� �ȴ�.
 */
public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		String[] str = {
			"Hello Java", 
			"No I mean it",
			"Nice to meet u"
		};
		
		int i = 0;   //���� �޼ҵ� ���̶� �̰͵� ���÷� �Ǵ°�??
		while(i<=3) {
			try {
				System.out.println(str[i]);//���� �߻����ɼ� �ڵ� �־���, try�ȿ�
			}catch(ArrayIndexOutOfBoundsException e)  {// ArrayIndexOutOfBoundsException�ڵ带 ��ڴٶ�¶�
			}
				i++;
		}
		
		
	}
	
	

}