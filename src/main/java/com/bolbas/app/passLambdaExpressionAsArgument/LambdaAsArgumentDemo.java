package com.bolbas.app.passLambdaExpressionAsArgument;

public class LambdaAsArgumentDemo {

	private static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "������ ��������� �������� ������������� Java";
		String outStr;
		
		System.out.println("��� �������� ������: " + inStr);
		
		outStr = stringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("��� ������ � ������� ��������: " + outStr);
		
		outStr = stringOp((str) -> {
			String result = "";
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) != ' ')
					result += str.charAt(i);
			}
			
			return result;
		}, inStr);
		System.out.println("��� ������ � ���������� ���������: " + outStr);
		
		StringFunc reverse = (str) -> {
			String result = "";
			
			for(int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
				
			return result;
		};
		
		System.out.println("��� ���������� ������: " + stringOp(reverse, inStr));
	}
	
}
