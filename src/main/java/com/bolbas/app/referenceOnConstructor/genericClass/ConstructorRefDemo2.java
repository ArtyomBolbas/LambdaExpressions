package com.bolbas.app.referenceOnConstructor.genericClass;

public class ConstructorRefDemo2 {

	public static void main(String[] args) {
		//������� ������ �� ����������� ����������� ������ �yClass<T>
		MyFunc<Integer> myClassCons = MyClass<Integer>::new;
		
		// ������� ��������� ������ �yClass<T>
		// �� ������ ������ �� �����������
		MyClass<Integer> mc = myClassCons.func(100);
		
		// ��������������� ������ ��� ���������
		// ����������� ������ �yClass<T>
		System.out.println("�������� val � ������� mc ����� " + mc.getVal());
	}

}
