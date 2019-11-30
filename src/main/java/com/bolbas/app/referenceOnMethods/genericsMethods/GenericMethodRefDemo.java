package com.bolbas.app.referenceOnMethods.genericsMethods;

public class GenericMethodRefDemo {

	//В качестве первого параметра этого метода указывается
	//функциональный интерфейс МyFunc, а в качестве двух других
	//параметров - массив и значение, причем оба типа Т
	public static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
		return f.func(vals, v);
	}
	
	public static void main(String[] args) {
		Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
		String[] strs = {"Один" , "Два" , "Три" , "Два"};
		int count;
		
		count = myOp(MyArrayOps::countMatching, vals, 4);
		System.out.println("Maccив vals содержит " + count + " числа 4");
		
		count = myOp(MyArrayOps::countMatching, strs, "Два");
		System.out.println("Maccив strs содержит " + count + " числа два");
	}
	
}
