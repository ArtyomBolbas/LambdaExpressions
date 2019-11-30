package com.bolbas.app.referenceOnConstructor.genericClass.factory;

public class ConstructorRefDemo3 {

	// ��������� ����� ��� �������� ������ �������.
	// � ������� ������ ������ ���� ���� �����������,
	// ����������� ���� �������� ���� � . � �������� R
	// ���������� ��� ������������ �������
	static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
		return cons.func(v);
	}
	
	public static void main(String[] args) {
		// ������� ������ �� ����������� ������ �yClass.
		// � ������ ������ �������� new ���������� � ������������,
		// ������������ ��������
		MyFunc<MyClassGeneric<Double>, Double> myClassCons = MyClassGeneric<Double>::new;
		
		// ������� ��������� ���� ������ �yClass, ��������� ��������� �����
		MyClassGeneric<Double> mc = myClassFactory(myClassCons, 100.1);
		
		// ������������ ������ ��� ��������� ��������� ������ �yClass
		System.out.println("�������� val � ������� mc ����� " + mc.getVal());
		
		// � ������ ������� ��������� ������� ������,
		// ��������� ����� JDYClassFactory()
		MyFunc<MyClass, String> myClassCons2 = MyClass::new;
		
		// ������� ��������� ������ �yClass2, ��������� ��������� �����
		MyClass mc2 = myClassFactory(myClassCons2, "������");
		
		System.out.println("�������� str � ������� mc2 ����� " + mc2.getStr());
	}
	
}
