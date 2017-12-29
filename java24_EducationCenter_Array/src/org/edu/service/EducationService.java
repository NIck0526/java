package org.edu.service;

import org.edu.exception.DuplicateSSNException;
import org.edu.exception.RecordNotFoundException;
import org.edu.vo.Employee;
import org.edu.vo.Person;
import org.edu.vo.Student;
import org.edu.vo.Teacher;

public class EducationService {
	private Person[ ] p;
	private int index;
	
	public EducationService(int size){
		p = new Person[size];
	}
	/*
	 * Person�� �ڽ��� �迭�� �߰��ϴ� ����.
	 * �迭�ȿ� ��ü�� �߰��ϰ� / index�� �����ؾ� �Ѵ�.
	 * ���࿡ ������ �迭�ȿ� �߰��Ϸ��� ����� �̹� �ִٸ�
	 * �߰��� ������� �ʵ��� �Ѵ�.
	 * DuplicateSSNException�� �Ͷ߸���.
	 */
	public void addPerson(Person per)throws DuplicateSSNException{
		for(int i=0; i<index;i++){
			if(per.getSsn()==p[i].getSsn())//�̹� �ִ� ����̶��
				throw new DuplicateSSNException("�̹� �׷� ��� �־");
		}//for
		
		p[index++] = per;
	}
	
	/*
	 * �迭�ȿ� ����ִ� Ư���� ����� �����ϴ� ����
	 * �̶� �����ϰ����ϴ� ����� �ִٸ� ������ ����...
	 * (���� for���� ����ؼ�....)
	 * ���࿡ �����Ϸ��� �ϴ� ����� ���ٸ�
	 * RecoredNotFoundException�� �Ͷ߸���.
	 */
	public void deletePerson(int ssn)throws RecordNotFoundException{
		boolean found = false;
		
		for(int i=0; i<index; i++){
			if(ssn==p[i].getSsn()){//ssn�� �ش��ϴ� ����� �ִٸ�
				for(int j=i; j<index-1;j++){
					p[j] = p[j+1];
				}//for
				p[index-1] = null;//�߰�
				index--;
				found = true;
			}//if
		}//for
		
		if(found==false)//ssn�� �ش��ϴ� ����� ���ٸ�
			throw new RecordNotFoundException("������ ����� ���");
	}
	/*
	 * ssn�� �������� �־� Ư���� ����� ã�Ƽ� �����ϴ� ����
	 */
	public Person findPerson(int ssn){
		Person person = null;
		for(int i=0; i<index; i++){
			if(ssn==p[i].getSsn())
				person = p[i];
		}//for
		
		return person;
	}
	
	public Person[ ] findPerson(String address){
		Person[ ] parr = new Person[index];//6ĭ...2ĭ
		int count = 0;
		
		for(int i=0; i<index; i++){
			if(address.equals(p[i].getAddress())){//�ּҰ� ������ ����� �ֵ���
				parr[count++] = p[i];
			}
		}
		return parr;
	}
	/*
	 * ������ ����� ���ٸ� RecordNotFoubndException�� �Ͷ߸���.
	 * ssn�� ������ ����� �ƴϴ�.
	 */
	public void updatePerson(int ssn, Person person)
			throws RecordNotFoundException{//���ڰ�??
		boolean flag = false;		
		for(int i=0; i<index; i++){
			if(ssn==p[i].getSsn()){
				p[i].setName(person.getName());
				p[i].setAddress(person.getAddress());
				if(person instanceof Student){
					Student s = (Student)person;
					s.setStuId(((Student) person).getStuId());
				}
				if(person instanceof Teacher){
					Teacher t = (Teacher)person;
					t.setSubject(((Teacher) person).getSubject());
				}
				if(person instanceof Employee){
					Employee e = (Employee)person;
					e.setDept(((Employee) person).getDept());
				}//if
				flag = true;
			}//if
		}//for
		if(flag==false) throw new RecordNotFoundException("������ ����� ���");
		
	}	
	public void getPersons(){
		for(Person per : p){
			System.out.println(per);
		}
	}
}

























