package com.first;

public class MathOperation {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int product(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation mo = new MathOperation();
		System.out.println("Addedline");
		System.out.println("Add: " + mo.add(5, 5));
		System.out.println("Subtract " + mo.subtract(50, 10));
		System.out.println("Product " + mo.product(10, 5));
		System.out.println("Divide " + mo.divide(50, 10));
	}

}
