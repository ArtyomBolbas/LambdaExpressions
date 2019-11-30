package com.bolbas.app.referenceOnMethods.genericsMethods;

public class MyArrayOps {
	
	//в этом классе определяется метод countМatching(), возвращающий
	//количество элементов в массиве, равных указанному значению.
	//Обратите внимание на то, что метод countМatchinq() является
	//обобщенным, тогда как класс МyArrayOps - необобщенным
	public static<T> int countMatching(T[] vals, T v) {
		int count = 0;
		
		for(int i = 0; i < vals.length; i++)
			if(vals[i] == v) count++;
			
		return count;
	}
}
