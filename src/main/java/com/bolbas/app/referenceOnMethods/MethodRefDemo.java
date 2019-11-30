package com.bolbas.app.referenceOnMethods;

public class MethodRefDemo {
	//В этом методе функциональный интерфейс указывается в качестве
	//типа первогоего параметра. Следовательно, ему может быть передан
	//любой экземпляр этого интерфейса, в ключая и ссылку на метод
	public static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Лямбда - выражения повышают эффективность Java";
		String outStr;
		
		outStr = stringOp(MyStringOps::strReverse, inStr);
		
		System.out.println("Иcxoднaя строка: " + inStr);
		System.out.println("Oбpaщeннaя строка: " + outStr);
	}
}
