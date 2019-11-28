package com.bolbas.app.referenceOnMethods.objects;

import com.bolbas.app.referenceOnMethods.StringFunc;

public class MethodRefDemo2 {

	public static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "������-��������� �������� ������������� Java";
		String outStr;
		
		MyStringOps2 strOps = new MyStringOps2();
		
		outStr = stringOp(strOps::strReverse, inStr);
		
		System.out.println("��������� ������: " + inStr);
		System.out.println("���������� ������: " + outStr);
	}
	
}
