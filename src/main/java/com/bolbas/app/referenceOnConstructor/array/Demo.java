package com.bolbas.app.referenceOnConstructor.array;

public class Demo {
	public static void main(String[] args) {
		MyArrayCreator<MyClass[]> mcArrayCons = MyClass[]::new;
		MyClass[] a = mcArrayCons.func(2);
		a[0] = new MyClass(1);
		a[1] = new MyClass(2);
	}
}
