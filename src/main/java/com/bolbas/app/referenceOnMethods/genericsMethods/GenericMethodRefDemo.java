package com.bolbas.app.referenceOnMethods.genericsMethods;

public class GenericMethodRefDemo {

	public static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
		return f.func(vals, v);
	}
	
	public static void main(String[] args) {
		Integer[] vals = {1, 2, 3, 4 , 2, 3, 4, 4, 5};
		String[] strs = {"����", "���", "���", "���"};
		int count;
		
		count = myOp(MyArrayOps::countMatching, vals, 4);
		System.out.println("������ vals �������� " + count + " ����� \"4\"");
		
		count = myOp(MyArrayOps::countMatching, strs, "���");
		System.out.println("������ strs �������� " + count + " ����� \"���\"");
	}
	
}
