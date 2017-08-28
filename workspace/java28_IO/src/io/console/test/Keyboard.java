package io.console.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Ű����� �о���� ����Ÿ��
 * �ַܼ� ����ϴ� �ҽ��ڵ��� ����
 * 1. ��Ʈ�� ����(�Է� ��Ʈ�� 2��)
 * 2. �о���δ�. readLine()
 * 3. �ܼ�â���� ���(System.out.println())
 */
public class Keyboard {

	public static void main(String[] args) throws IOException{
		//1.
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("1. ��Ʈ���� �����Ǿ���...");
		System.out.println("2. Ű����� ����Ÿ�� �Է��ϼ���...");
		
		//2.
		String line = br.readLine();
		
		//3.
		System.out.println("Reading Data :: " +line);
		
		//4.
		br.close();
	}

}
















