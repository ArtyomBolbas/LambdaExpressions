package com.bolbas.app.referenceOnConstructor;

public class ConstructorRefDemo {
	
	public static void main(String[] args) {
		// ������� ������ �� ����������� ������ �yClass.
		// ����� func() �� ���������� �yFunc ��������� ��������,
		// ������� �������� new ���������� � ��������������������
		// ������������ ������ �yClass, � �� � ��� ������������ �� ���������
		MyFunc myClassCons = MyClass::new;
		
		//������� ��������� ������ �yClass �� ������ �� ��� �����������
		MyClass mc = myClassCons.func(100);
		
		//������������ ������ ��� ��������� ��������� ������ �yClass
		System.out.println("�������� val � ������� mc ����");
	}
	
}
