package com.bolbas.app.practice;

import com.bolbas.app.simpleExampleFunctionalInterface.NumericTest;

public class FromSimpleToBlock {
	public static void main(String[] args) {
		NumericTest isEven = (n) -> {
			boolean result = false;
			
			if((n % 2) == 0)
				result = true;
			
			return result;
		};
		
		System.out.println(isEven.test(9));
	}
}
