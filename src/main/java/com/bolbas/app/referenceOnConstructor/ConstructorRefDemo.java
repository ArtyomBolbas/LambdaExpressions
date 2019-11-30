package com.bolbas.app.referenceOnConstructor;

public class ConstructorRefDemo {
	
	public static void main(String[] args) {
		// Создать ссылку на конструктор класса МyClass.
		// Метод func() из интерфейса МyFunc принимает аргумент,
		// поэтому оператор new обращается к параметризированному
		// конструктору класса МyClass, а не к его конструктору по умолчанию
		MyFunc myClassCons = MyClass::new;
		
		//создать экземпляр класса МyClass по ссылке на его конструктор
		MyClass mc = myClassCons.func(100);
		
		//использовать только что созданный экземпляр класса МyClass
		System.out.println("Значение val в объекте mc рано");
	}
	
}
