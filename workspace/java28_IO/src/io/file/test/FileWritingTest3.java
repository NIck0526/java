package io.file.test;
/*
 * PrintWriter�� Node�迭��
 * �̶� ���α׷��� ��� �޶������� ���� Ȯ���ϱ�
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;

public class FileWritingTest3 {

	public static void main(String[] args)throws IOException {
		//1.
		String inputFile = "src\\poem.txt";
		String outputFile = "src\\result.txt";
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		PrintWriter pw = new PrintWriter(outputFile);
		System.out.println("result.txt ������ �����Ǿ���..");
		System.out.println("������ ��� ����Ͻÿ�.");
		//2.
		String line = null;
		while((line = br.readLine())!=null) {
		//System.out.println(line);
			pw.println(line);
		}
		/*br.close();
		pw.close();*/
		//�ﰢ������ capacity�� ����ִ� ����Ÿ�� �Ѹ���....
		//pw.flush();//auto flushing���
		pw.close();
		 //Node�迭 �̾�� (�⺻��Ʈ��)
	}

}