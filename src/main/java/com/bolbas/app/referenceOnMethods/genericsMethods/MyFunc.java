package com.bolbas.app.referenceOnMethods.genericsMethods;

//������������������ ���������� ������ �� ���������� �����,
//����������� � ������������ ������
//�������������� ��������� ��� ��������� ������� ��������
//� �������� �������������� ����������
@FunctionalInterface
public interface MyFunc<T> {
	int func(T[] vals, T v);
}
