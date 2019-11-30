package com.bolbas.app.referenceOnConstructor.genericClass.factory;

public class MyClass {

	private String str;
	
	MyClass(String s) {
		str = s;
	}
	
	MyClass() {
		str = "";
	}
	
	String getStr() {
		return str;
	}
}
