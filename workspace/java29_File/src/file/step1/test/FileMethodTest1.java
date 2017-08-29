package file.step1.test;

import java.io.File;

/*
 * IO���� ���� ����ϰ� ���Ǵ� File Ŭ����
 * File Ŭ�������� �����ϴ� �⺻���� ����� ���� ���� ����
 * ::
 * getName() :: Ȯ���ڸ� ������ �����̸��� ����
 * getPath(), getAbsolutePath() :: ��θ� ������ ���ϸ�
 * String getParent(), FIle getParentFile() :: ��θ� �ľ�
 * mkdir(), mkdirs() :: �������� �ʴ� ��θ� ���������� ����
 */
public class FileMethodTest1 {

	public static void main(String[] args) {
		//File�� �ǹ��ϴ� ������ ���丮 + ���ϸ�(Ȯ���ڸ� ������)
		File f = new File("C:\\Intel"+File.separator+"lkm\\javaPro\\eclipse\\workspace\\java29_File\\src\\file\\step1\\test\\FileMethodTest1.java");
		File file = new File("C:\\test\\a.txt");
		String fileName =f.getName();
		System.out.println("getName() :: "+fileName);
		
		//FileMethodTest1
		//.�� ��ġ�� �˾Ƽ� substring()�� ���
		int position = fileName.indexOf('.');
		System.out.println("1. Ȯ���ڸ� ������ ���ϸ� :: "+fileName.substring(0,position));
		System.out.println("2. Ȯ���ڸ� ��� :: "+fileName.substring(position+1));
		
		//���
		System.out.println(" getAbsolutePath() :: ������ ������ "+f.getAbsolutePath());
		System.out.println(" getPath() :: ������ ������ ���"+f.getPath());
		
		System.out.println("getParent() ::"+f.getParent());
		//������ �ִ� ���丮
		System.out.println("getParentFile() ::"+f.getParentFile());
		
		
	}

}