package com.bolbas.app.referenceOnMethods.objects.highTemp;

/**
 * @author Smart
 *
 * @param <T>
 * 
 * »спользовать ссылку на метод экземпл€ра вместе с разными объектами
 * 
 * ‘ункциональный интерфейс с методом, принимающим два ссылочных
 * аргумента и возвращающим логическое значение
 */
public interface MyFunc<T> {
	boolean func(T v1, T v2);
}
