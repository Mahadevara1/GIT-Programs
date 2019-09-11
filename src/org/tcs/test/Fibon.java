package org.tcs.test;

public class Fibon {
public static void main(String[] args) {
	int a=0,b=1;
	System.out.println(a);
	System.out.println(b);
	for (int i = 0; i <=20; i++) {
		int c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
}
}
