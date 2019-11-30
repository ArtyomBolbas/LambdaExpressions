package com.bolbas.app.referenceOnConstructor.genericClass;

public class ConstructorRefDemo2 {

	public static void main(String[] args) {
		//создать ссылку на конструктор обобщенного класса МyClass<T>
		MyFunc<Integer> myClassCons = MyClass<Integer>::new;
		
		// создать экземпляр класса МyClass<T>
		// по данной ссылке на конструктор
		MyClass<Integer> mc = myClassCons.func(100);
		
		// воспользоваться только что созданным
		// экземпляром класса МyClass<T>
		System.out.println("Значение val в объекте mc равно " + mc.getVal());
	}

}
