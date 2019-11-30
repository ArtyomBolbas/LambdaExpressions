package com.bolbas.app.referenceOnMethods.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {

	private static int compareMC(MyClass a, MyClass b) {
		return a.getVal() - b.getVal();
	}
	
	public static void main(String[] args) {
		ArrayList<MyClass> al = new ArrayList<>();
		
		al.add(new MyClass(1));
		al.add(new MyClass(4));
		al.add(new MyClass(2));
		al.add(new MyClass(9));
		al.add(new MyClass(3));
		al.add(new MyClass(7));
		
		// найти максимальное значение, используя метод compareMC()
		MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);
		
		System.out.println("Максимальное значение равно: " + maxValObj.getVal());
	}
	
}
