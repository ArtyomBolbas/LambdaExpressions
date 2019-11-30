package com.bolbas.app.referenceOnConstructor;

public class MyClass {

	private int val;
	
	public MyClass(int v){
		val = v;
	}
	
	public MyClass(){
		val = 0;
	}

	public int getVal() {
		return val;
	}
	
}
