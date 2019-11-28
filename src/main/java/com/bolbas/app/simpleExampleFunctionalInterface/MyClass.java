package com.bolbas.app.simpleExampleFunctionalInterface;

public class MyClass {
	
	public static void main(String[] args) {
		/*MyNumber myNum;
		myNum = () -> 123.45;
		System.out.println("fixed value = " + myNum.getValue());
		
		myNum = () -> Math.random() * 100;
		System.out.println("random value = " + myNum.getValue());
		System.out.println("one more random meaning = " + myNum.getValue());*/
		
		//myNum = () -> "123.03";
		//***************************//
		
		/*NumericTest isEven = n -> (n % 2) == 0;
		//NumericTest isEven = (n) -> (n % 2) == 0;
		//NumericTest isEven = (int n) -> (n % 2) == 0;
		if(isEven.test(10)) System.out.println("����� 10 ������");
		if(!isEven.test(9)) System.out.println("����� 9 ��������");
		
		NumericTest isNonNeg = (n) -> n >= 0;
		if(isNonNeg.test(1)) System.out.println("����� 1 ���������������");
		if(!isNonNeg.test(-1)) System.out.println("����� -1 �������������");*/
		//***************************//
		
		//NumericTest2 isFactor = (n, d) -> (n % d) == 0;
		NumericTest2 isFactor = (int n, int d) -> (n % d) == 0;
		
		if(isFactor.test(10, 2))
			System.out.println("����� 2 ��������  ���������� ����� 10");
		if(!isFactor.test(10, 3))
			System.out.println("����� 3 �� �������� ���������� ����� 10");
		
		
		
		
	}

}
