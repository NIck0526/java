package exception.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOExceptionTest2 {
	public static void main(String[] args) {
		String FileName = "c:\\kosta\\test\\poem.text"; //file ��ε� file�� �ȴ�. ��, ���丮+��������
		try {
			FileReader fr = new FileReader(FileName);
			
			fr.read();
			System.out.println("���� �о���.");
		}/*catch(FileNotFoundException e) {
			
		}*/catch(IOException e) {
			
		}

	}

}



/*
 * 								IOException
 * 									 |
 * 							FileNotFoundException
 * 
 */



