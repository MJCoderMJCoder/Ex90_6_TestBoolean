package com.testboolean;

public class TestBoolean {

	public static void main(String[] args) {
		Boolean b1 = new Boolean("true"); //����Boolean����
		Boolean b2 = new Boolean("false");
		Boolean b3 = new Boolean("Hello");
		Boolean b [] = {b1, b2, b3}; //����һ��Boolean����
		for (int i = 0; i < b.length; i++)
			System.out.println("b" + (i+1) + "��" + b[i].booleanValue());
	}

}
