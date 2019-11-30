package com.bolbas.app.referenceOnMethods.objects.highTemp;

//����� ��� ������� � ������������ ����������� �� ����
public class HighTemp {
	private int hTemp;
	
	HighTemp(int ht){
		hTemp = ht;
	}
	
	//���������� ���������� �������� true, ���� ���������� ������
	//���� HighTemp ����� ����� �� �����������, ��� � � ������� ht2
	boolean sameTemp(HighTemp ht2) {
		return this.hTemp == ht2.hTemp;
	}
	
	//���������� ���������� �������� true, ���� ���������� ������
	//���� HighTemp ����� ����������� ����, ��� � ������� ht2
	boolean lessThanTemp(HighTemp ht2) {
		return this.hTemp < ht2.hTemp;
	}
	
	
}
