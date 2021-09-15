package com.bridgelabz;

import java.util.*;

public class Array2D {

	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		m = sc.nextInt();
		System.out.print("Enter no of columns : ");
		n = sc.nextInt();

		int[][] myArr = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter value for " + i + " " + j + " : ");
				myArr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array : ");

		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				System.out.print(myArr[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
