package com.arithmetic.multiplication;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DivisionBLogic {
	public int execute(int a, int b) {
		System.out.println(" AdditionBLogic.execute(" + a + "," + b + ")");
		return a / b;
	}
}
