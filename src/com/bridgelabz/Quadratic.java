package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		double firstRoot = 0, secondRoot = 0;
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a : ");
		a = sc.nextDouble();

		System.out.print("Enter value of b : ");
		b = sc.nextDouble();

		System.out.print("Enter value of c : ");
		c = sc.nextDouble();

		double delta = (b * b) - (4 * a * c);

		firstRoot = (-b + delta) / (2 * a);
		secondRoot = (-b - delta) / (2 * a);
		System.out.println("Roots are :: " + firstRoot + " and " + secondRoot);

	}

}
