package com.bolbas.app.referenceOnConstructor.genericClass.factory;

/**
 * @author Smart
 *
 * @param <R>
 * @param <T>
 * 
 *  ����������� ������� ������� �������, ��������� ������ �� �����������
 */
public interface MyFunc<R, T> {
	R func(T n);
}
