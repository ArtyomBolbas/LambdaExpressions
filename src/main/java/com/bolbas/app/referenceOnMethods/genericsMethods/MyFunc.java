package com.bolbas.app.referenceOnMethods.genericsMethods;

//Продемонстрировать применение ссылки на обобщенный метод,
//объявленный в необобщенном классе

//Функциональный интерфейс для обработки массива значений
//и возврата целочисленного результата
@FunctionalInterface
public interface MyFunc<T> {
	int func(T[] vals, T v);
}
