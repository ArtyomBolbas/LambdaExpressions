package com.bolbas.app.referenceOnConstructor.genericClass.factory;

public class ConstructorRefDemo3 {

	// Фабричный метод для объектов разных классов.
	// У каждого класса должен быть свой конструктор,
	// принимающий один параметр типа Т . А параметр R
	// обозначает тип создаваемого объекта
	static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
		return cons.func(v);
	}
	
	public static void main(String[] args) {
		// Создать ссылку на конструктор класса МyClass.
		// В данном случае оператор new обращается к конструктору,
		// принимающему аргумент
		MyFunc<MyClassGeneric<Double>, Double> myClassCons = MyClassGeneric<Double>::new;
		
		// создать экземпляр типа класса МyClass, используя фабричный метод
		MyClassGeneric<Double> mc = myClassFactory(myClassCons, 100.1);
		
		// использовать только что созданный экземпляр класса МyClass
		System.out.println("Значение val в объекте mc равно " + mc.getVal());
		
		// А теперь создать экземпляр другого класса,
		// используя метод JDYClassFactory()
		MyFunc<MyClass, String> myClassCons2 = MyClass::new;
		
		// создать экземпляр класса МyClass2, используя фабричный метод
		MyClass mc2 = myClassFactory(myClassCons2, "Лямбда");
		
		System.out.println("Значение str в объекте mc2 равно " + mc2.getStr());
	}
	
}
