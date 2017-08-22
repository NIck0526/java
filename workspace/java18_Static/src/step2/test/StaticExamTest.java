package step2.test;
/*
 * 4.5 ::
 * ������ ����� ��ġ�� �ٸ��� ���ǵȴ�.
 * filed, static V �� Ŭ���� �ٷ� ��, �޼ҵ� �ٱ��� �����
 * (�⺻���� �ִ�... �ʱ�ȭ ���ϰ� �ٷ� ����ص� ��)
 * 
 * local V�� �޼ҵ� �ȿ��� ����
 * (�⺻���� ����... �ʱ�ȭ ���ϰ� ����ϸ� ������ �� ������)
 */

public class StaticExamTest {
	
	int i=10;  //field, Member Variable �� �ҷ��ּ�
	static int j = 20; //class ����, static ����, ���� ����
	
	public void test() {
		System.out.println("member Variable :: "+i);
		System.out.println("member Variable :: "+j);
	}
	
	/*
	 * static block�ȿ��� non-static memeber�� ����� �� ����.
	 * ::
	 * �޸𸮿� �ö� ���� ���� i�� ����� �� ����.
	 * ������ j�� �̹� �޸𸮿� �ö� �־ ����� �� �ִ�.
	 * :static�� static���� ���Ѵ�."
	 * �޸𸮿� �ö� �ִ� �ֵ鳢�� ����� �� �ִ�. (��ü�������� �޸𸮸� ����� �� �־ ������ ��.)
	 */
	
	public static void test2() {
		System.out.println("member Variable :: "+i);
		System.out.println("member Variable :: "+j);
	
	public static void main(String[] args) {
		
		int k =  0; // local ����, ���� ����, Temporary V, automatically V
		test2();
		StaticExamTest test = new StaticExamTest();
		test.test();
		
		
		
		
	}

}











