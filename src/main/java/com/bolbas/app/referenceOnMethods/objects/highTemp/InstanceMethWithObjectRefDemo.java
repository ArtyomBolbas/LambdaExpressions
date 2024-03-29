package com.bolbas.app.referenceOnMethods.objects.highTemp;

public class InstanceMethWithObjectRefDemo {
	
	//�����, ������������ ���������� ����������� ������� ,
	//��������� �� ��������� , ���������� ����������
	//��������������� ��������� MyFunc
	public static <T> int counter(T[] vals, MyFunc<T> f, T v) {
		int count = 0;
		
		for(int i = 0; i < vals.length; i++)
			if(f.func(vals[i], v)) count++;
			
		return count;
	}
	
	public static void main(String[] args) {
		int count;
		
		// ������� ������ �������� ���� HighTemp
		HighTemp[] weekDayHighs = {
				new HighTemp(89), new HighTemp(82),
				new HighTemp(90), new HighTemp(89),
				new HighTemp(89), new HighTemp(91),
				new HighTemp(84), new HighTemp(83)};
		
		// ������������ ����� counter() ������ � ��������� ��������
		// ���� HighTemp. �������� �������� �� ��, ��� ������ �� �����
		// ���������� sameTemp() ���������� � �������� ������� ���������
		count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
		
		System.out.println("����, ����� ������������ ����������� ���� 89: " + count);
		
		HighTemp[] weekDayHighs2 = {
				new HighTemp(32), new HighTemp(12),
				new HighTemp(24), new HighTemp(19),
				new HighTemp(18), new HighTemp(12),
				new HighTemp(-1), new HighTemp(13)};
		
		count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
		
		System.out.println("����, ����� ������������ ����������� ���� 12: " + count);
		
		count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
		
		System.out.println("����, ����� ������������ ����������� ���� ������ 89: " + count);
		
		count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
		
		System.out.println("����, ����� ������������ ����������� ���� ������  19: " + count);
	}
}
