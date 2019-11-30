package com.bolbas.app.referenceOnConstructor.genericClass;

public class MyClass<T> {
	private T val;
	
	public MyClass(T v) {
		val = v;
	}
	
	public MyClass() {
		val = null;
	}
	
	public T getVal() {
		return val;
	}
	
}
