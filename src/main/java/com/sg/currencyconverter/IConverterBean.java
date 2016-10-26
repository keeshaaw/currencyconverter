package com.sg.currencyconverter;

public abstract interface IConverterBean {
	public abstract double dollarToYen(double paramBigDecimal);

	public abstract double yenToEuro(double paramBigDecimal);
	
	public abstract void test();
}
