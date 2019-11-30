package com.bolbas.app.referenceOnMethods.objects.highTemp;

public class InstanceMethWithObjectRefDemo {
	
	//ћетод, возвращающий количество экземпл€ров объекта ,
	//найденных по критери€м , задаваемым параметром
	//функционального интерфейс MyFunc
	public static <T> int counter(T[] vals, MyFunc<T> f, T v) {
		int count = 0;
		
		for(int i = 0; i < vals.length; i++)
			if(f.func(vals[i], v)) count++;
			
		return count;
	}
	
	public static void main(String[] args) {
		int count;
		
		// создать массив объектов типа HighTemp
		HighTemp[] weekDayHighs = {
				new HighTemp(89), new HighTemp(82),
				new HighTemp(90), new HighTemp(89),
				new HighTemp(89), new HighTemp(91),
				new HighTemp(84), new HighTemp(83)};
		
		// »спользовать метод counter() вместе с массивами объектов
		// типа HighTemp. ќбратите внимание на то, что ссылка на метод
		// экземпл€ра sameTemp() передаетс€ в качестве второго параметра
		count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
		
		System.out.println("ƒней, когда максимальна€ температура была 89: " + count);
		
		HighTemp[] weekDayHighs2 = {
				new HighTemp(32), new HighTemp(12),
				new HighTemp(24), new HighTemp(19),
				new HighTemp(18), new HighTemp(12),
				new HighTemp(-1), new HighTemp(13)};
		
		count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
		
		System.out.println("ƒней, когда максимальна€ температура была 12: " + count);
		
		count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
		
		System.out.println("ƒней, когда максимальна€ температура была меньше 89: " + count);
		
		count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
		
		System.out.println("ƒней, когда максимальна€ температура была меньше  19: " + count);
	}
}
