package com.bolbas.app.referenceOnConstructor.genericClass.factory;

/**
 * @author Smart
 *
 * @param <R>
 * @param <T>
 * 
 *  –еализовать простую фабрику классов, использу€ ссылку на конструктор
 */
public interface MyFunc<R, T> {
	R func(T n);
}
