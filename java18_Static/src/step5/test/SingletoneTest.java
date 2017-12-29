package step5.test;
/*
 * �̱��� ����
 * ::
 * �ϳ��� Ŭ���� Ÿ���� ���� �ϳ��� ��ü���� �����ϵ��� �ϴ� ����
 * 1. �ϴ� ��ü �ϳ��� �����Ѵ�
 *    private static���� �����ؼ� ����
 * 2. �ٸ� �������� �� Ŭ���� Ÿ������ ��ü�� �������� ���ϵ��� ���Ƶд�
 * 	  private �� ������ �տ� ���δ�.
 * 3. ����� ���� ��ü�� �������⼭ ����� ����� �� �ֵ��� ����д�
 *    public static
 */


class SunCompany{ //Java Instructor�� �����ϴ� ȸ��
	private String companyName;
	//1. sun
	private static SunCompany sun = new SunCompany();	
	
	//2. 
	
	private SunCompany(){
		companyName = "Sun Microsystems";
		System.out.println("Company ::"  + companyName);
	}
	
	//3.
	public static SunCompany getCompany() {
		return sun;
	}
	
}
public class SingletoneTest {

	public static void main(String[] args) {
		
		SunCompany com1 = SunCompany.getCompany();
		SunCompany com2 = SunCompany.getCompany();
		SunCompany com3 = SunCompany.getCompany();
		
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
	}

}