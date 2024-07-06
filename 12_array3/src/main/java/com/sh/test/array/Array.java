package com.sh.test.array;

import java.util.Random;
import java.util.Scanner;

public class Array {
	Scanner sc = new Scanner(System.in);
	public void test1() {
		Random rnd = new Random();
		int arr[][] = new int[3][5];
		
		for (int i = 0; i < arr.length; i++) { // 행[3]
			for (int j = 0; j < arr[i].length; j++) { //열[5]
				arr[i][j] = (rnd.nextInt(100) + 1);
				if (arr[i][j] % 5 == 0) {
					System.out.printf("arr[%d][%d] = %d%n",i, j, arr[i][j]);
				}
			}
		}
	}
	public void test2() {
		Random rnd = new Random();
		int arr[][] = new int[4][4];
		
		System.out.println("   1열   2열   3열   합계");
		
		for(int i = 0; i< arr.length; i++) {
			int sum = 0;
			
			for(int j = 0; j <arr[i].length; j++) {
				arr[i][j]=(rnd.nextInt(100)+1);
				if(arr[i][j]==0) {
					arr[i][j] = sum / (arr[j].length - 1);
				}
			}
			
			}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d행 %d ", i+1, arr[i][j]);

			}
			System.out.println();
		}
	}
}


