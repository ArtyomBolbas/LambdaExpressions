package com.bolbas.app.captureOfVariables;

public class VarCapture {

	public static void main(String[] args) {
		int num = 10;
		
		MyFunc myLambda = (n) -> {
			int result = num + n;
			
			//num++;
			
			return result;
		};
		
		//num = 9;
	}

}
