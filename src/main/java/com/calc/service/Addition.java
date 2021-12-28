package com.calc.service;

public class Addition implements Calculation{

	@Override
	public double calculation() {
		double number1 = 5;
		double number2 = 6;
		double sum;		
		sum = number1 + number2;		
		System.out.println("Sum Of Two Number is " + sum);
		return sum;
	}
	

}
